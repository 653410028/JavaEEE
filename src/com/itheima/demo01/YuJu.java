package com.itheima.demo01;

import java.util.Date;

public class YuJu extends Thread {
    public static void main(String[] args) {
        //循环嵌套
        for (int hour=0;hour<24;hour++){
            for (int minute=0;minute<60;minute++){
                for (int second=0;second<60;second++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //System.out.println(new Date());
                    System.out.println(hour + "时" + minute + "分" + second + "秒");
                }
                System.out.println("-------");
            }
        }
    }
}
