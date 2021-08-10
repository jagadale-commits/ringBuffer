package com.company;

public class producer extends Thread
{
    synchronized void produce(byte[] item, ringBuffer buffer)
    {
        //inserts the byte array in buffer at the end
        //replaces if buffer is full and start is increased
        for (byte b: item) {
            if(buffer.start==-1)
            {
                buffer.start=0;
                buffer.data[(buffer.end++)%buffer.capacity ] = b;
            }
            else if (buffer.start == buffer.end )
            {
                buffer.data[(buffer.end++)%buffer.capacity ] = b;
                buffer.start++;
                buffer.start%=buffer.capacity;
            }
            else
            buffer.data[(buffer.end++)%buffer.capacity ] = b;
        }

    }
}