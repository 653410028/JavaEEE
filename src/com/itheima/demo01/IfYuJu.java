package com.itheima.demo01;

public class IfYuJu {
    public static void main(String[] args) {
        System.out.println("开始");
        //定义两个变量
        int a = 10;
        int b = 20;
        //需求：判断a和b的值是否相等，如果相等，这输出a=b
        if (a == b){
            System.out.println("a等于b");
        }
        int c = 10;
        if (a == c){
            System.out.println("a等于c");
        }
        System.out.println("结束");
    }
}
