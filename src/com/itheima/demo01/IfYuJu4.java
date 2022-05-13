package com.itheima.demo01;

import java.util.Scanner;

public class IfYuJu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明考试成绩：(0-100)");
        int score = sc.nextInt();
        //数据测试：正确数据、边界数据、错误数据
        if (score > 100 || score < 0){
            System.out.println("您输入的有误，请重新输入！");
        } else if (score >= 95 && score <= 100){
            System.out.println(score + "=小明将得到自行车的奖励");
        }else if (score >=90 && score <= 94){
            System.out.println(score + "=小明将得到游戏机的奖励");
        }else if (score >= 80 && score <= 89){
            System.out.println(score + "=小明将得到小玩具的奖励");
        }else {
            System.out.println(score + "=小明将得到棍棒棒的奖励");
        }

    }
}
