package com.company;

public class ringBuffer {

    final int capacity = 5000000;
    byte[] data = new byte[capacity];
    int end = 0;
    int start = -1;
    //read write length
    int length = 1;
}
