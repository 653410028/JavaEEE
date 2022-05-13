package com.itheima.demo01;

import java.util.Scanner;

public class IfYuJu3 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数(1-7)数字：");
        int week = sc.nextInt();
        if (week > 7 || week <1){
            System.out.println("您输入的有误，请重新输入！");
        }
        else if (week == 1){
            System.out.println(week + ":是星期一");
        }else if (week == 2){
            System.out.println(week + ":是星期二");
        }else if (week == 3){
            System.out.println(week + ":是星期三");
        }else if (week == 4){
            System.out.println(week + ":是星期四");
        }else if (week == 5){
            System.out.println(week + ":是星期五");
        }else if (week == 6){
            System.out.println(week + ":是星期六");
        }else {
            System.out.println(week + ":是星期日");
        }
        System.out.println("结束");
    }
}
