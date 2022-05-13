package com.itheima.demo01;

public class YunSuanFu {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        //除法得到的是商，取余得到是余数
        System.out.println(a / b);
        System.out.println(a % b);
        //整数相除只能得到整数，要想得到小数，必须有浮点数的参与
        System.out.println(6.0 / 4);

        int i = 10;
        char c = 'A';//字符大A的值是65
        c = 'a';//字符小a的值是97
        c = '0';//字符0的值是48
        System.out.println(i + c);

        int ch = i + c;
        System.out.println(ch);
        double k = 10 + 13.14;
        System.out.println(k);

        System.out.println("it" + "heima");
        System.out.println("itheima" + 666);
        System.out.println(666 + "itheima");


        System.out.println("黑马" + 6 + 666);
        System.out.println(1 + 99 + "年黑马");

        int q = 10;
        System.out.println("q:" + q);

        //+=把左边和右边的数据做加法操作，结果赋值给左边

        q += 20;
        System.out.println("q:" + q);

        q = q + 20;
        System.out.println("q:" + q);

        short s = 10;
        s += 20;
        s = (short)(s + 20);
        System.out.println("s:" + s);

        int w = 10;
        /*
        System.out.println("w:" + w);
        w++;
        System.out.println("w:" + w);
        w--;
        System.out.println("w:" + w);
        int j = w++;
        System.out.println("w:" + w);
        System.out.println("j:" + j);
         */
        int j = ++w;
        System.out.println("w:" + w);
        System.out.println("j:" + j);

    }
}
