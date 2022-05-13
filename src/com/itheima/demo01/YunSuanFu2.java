package com.itheima.demo01;

public class YunSuanFu2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //获取两个数据中的较大值
        //int max = a > b ? a : b;
        //输出结果
        //System.out.println("max:" + max);

        //获取两个数据中的较大值
        int max = a < b ? a : b;
        //输出结果
        System.out.println("max:" + max);
    }
}
