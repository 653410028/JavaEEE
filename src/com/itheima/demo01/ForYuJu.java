package com.itheima.demo01;

public class ForYuJu {
    public static void main(String[] args) {
        /*
        System.out.println("----------");
        for (int i=1;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("----------");
        for (int i=5;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("----------");
        int sum = 0;
        for (int i=1;i<=5;i++){
            sum += i;
        }
        System.out.println("1-5之间的和=" + sum);
        System.out.println("----------");

        int sum1 = 0;
        for (int i=1;i<=100;i++){
            if (i % 2 == 0){
                sum1 += i;
            }
        }
        System.out.println("1-100之间的偶数和=" + sum1);
        System.out.println("----------");
        //三位数筛选到水仙花
        for (int i = 100;i < 1000;i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i);
            }
         */
            System.out.println("----------");
            //水仙花
            int count = 0;
            for (int i = 100;i < 1000;i++){
                int ge = i%10;
                int shi = i/10%10;
                int bai = i/10/10%10;
                if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                    count++;
                }
            }
        System.out.println("水仙花共有：" + count + "个");
        }
}