package com.company;

public class consumer extends Thread {
        synchronized byte[] consume(ringBuffer buffer) {
                byte[] b = new byte[buffer.length];
                if (buffer.start ==-1)
                        return b;
                try {
                        for (int i = 0; i < b.length; i++) {
                                b[i] = buffer.data[(buffer.start++) % buffer.capacity];
                                if(buffer.start== buffer.end)
                                {
                                        buffer.start=-1;
                                        buffer.end = 0;
                                        break;
                                }
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return b;
        }
}
