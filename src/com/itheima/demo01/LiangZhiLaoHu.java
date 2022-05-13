package com.itheima.demo01;

public class LiangZhiLaoHu {
    public static void main(String[] args) {
        /*
        int weight1 = 180;
        int weight2 = 200;
        boolean b = weight1 == weight2 ? true : false;
        System.out.println("b:" + b);
        */
        /*
        int height1 = 150;
        int height2 = 165;
        int height3 = 210;
        int tempHeight = (height1 > height2) ? height1 : height2;
        int maxHeight = tempHeight > height3 ? tempHeight : height3;
        System.out.println("maxHeight:" + maxHeight);
        */
        int height1 = 230;
        int height2 = 165;
        int height3 = 180;
        int tempHeight = (height1 > height2) ? height1 : height2;
        int maxHeight = (tempHeight > height3) ? tempHeight : height3;
        System.out.println("maxHeight:" + maxHeight);
    }
}
