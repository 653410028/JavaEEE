package com.itheima.demo01;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();


        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10);
            System.out.println("number:" + number);
        }
    }
}
