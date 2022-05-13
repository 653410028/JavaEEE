package com.itheima.demo01;
import java.util.Scanner;
public class SwitchYuJu1 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份对应的数字：");
        int month = sc.nextInt();
        switch (month){
            //case穿透
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("您输入的数字有误，请重新输入！");
                //break;
        }
        System.out.println("结束");

    }
}
