package com.itheima.demo01;

//导入数据输入包
import java.util.Scanner;

public class ShuJuShuRu {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接受数据
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();

        int tempHeight = (height1 > height2) ? height1 : height2;
        int maxHeight = (tempHeight > height3) ? tempHeight : height3;

        //输出数据
        System.out.println("这三个和尚中身高最高的是:" + maxHeight + "cm");
    }
}
