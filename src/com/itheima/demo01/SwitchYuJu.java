package com.itheima.demo01;

import java.util.Scanner;

public class SwitchYuJu {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数(1-7)数字：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println(week + ":是星期一");
                break;
            case 2:
                System.out.println(week + ":是星期二");
                break;
            case 3:
                System.out.println(week + ":是星期三");
                break;
            case 4:
                System.out.println(week + ":是星期四");
                break;
            case 5:
                System.out.println(week + ":是星期五");
                break;
            case 6:
                System.out.println(week + ":是星期六");
                break;
            case 7:
                System.out.println(week + ":是星期日");
                break;
            default:
                System.out.println("您输入的有误，请重新输入!");
        }
        System.out.println("结束");
    }
}
