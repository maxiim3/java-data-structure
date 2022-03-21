package com.maxdjk;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(45);
        numbers.insert(125);

        numbers.print();
    }
}
