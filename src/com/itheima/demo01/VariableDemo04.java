package com.itheima.demo01;

//1. 定义一个类, 类名叫: VariableDemo04
public class VariableDemo04 {
    //2. 定义main方法, 作为程序的主入口.
    public static void main(String[] args) {
        //3. 变量未赋值，不能使用.
        int a;
        a = 10;
        System.out.println(a);      //这样写, 代码会报错, 因为变量a没有赋值.

        //4. 变量只在它所属的范围内有效.

            //大括号包裹起来的代码叫: 代码块.
            //作用: 让变量尽可能早的从内存消失, 从而节约资源, 提高效率.
            double d = 5.21;
            System.out.println(d);

        //下边这行代码会报错, 出了上述的大括号, 变量d就已经从内存中消失了, 无法访问.
        System.out.println(d);
        //5. 一行上可以定义多个变量，但是不建议.
        int e = 10, f = 20, g = 30;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
