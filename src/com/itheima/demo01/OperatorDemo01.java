package com.itheima.demo01;

public class OperatorDemo01 {
    public static void main(String[] args) {
    //定义两个int类型的变量a和b, 分别赋值为10和5.
    int a = 10;
    int b = 5;
    //通过`关系运算符`比较这两个变量之间的关系, 并打印结果.
    System.out.println(a > b);
    System.out.println(5 >= 5);
    System.out.println(a < b);
    System.out.println(5 <= 5);
    System.out.println(a != b);
    System.out.println(a == b);
    System.out.println(a = b);

    //关系运算符的最终结果是boolean类型, 所以我们也可以用boolean类型的变量接收.
    boolean flag = 10 < 5;
    System.out.println(flag);
}
}
