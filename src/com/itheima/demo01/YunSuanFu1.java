package com.itheima.demo01;

public class YunSuanFu1 {
    public static void main(String[] args) {
        /*
        //定义变量
        int i = 10;
        int j = 20;
        int k = 10;
        //==
        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println("-----------------------");
        //!=
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("-----------------------");
        //>
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("-----------------------");
        //>=
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("-----------------------");
        //<
        System.out.println(i < j);
        System.out.println(i < k);
        System.out.println("-----------------------");
        //<=
        System.out.println(i <= j);
        System.out.println(i <= k);
        System.out.println("-----------------------");
        //把j的值赋值给了i，输出i的值
        System.out.println(i = j);
        */
        int i = 10;
        int j = 20;
        int k = 30;
        /*
        //& 两个表达式有false则false
        System.out.println((i > j) & (j > k));//false & false
        System.out.println((i < j) & (j > k));//true & flase
        System.out.println((i > j) & (j < k));//false & true
        System.out.println((i < j) & (j < k));//true & true
        System.out.println("---------------------");
        //| 两个表达式有true则true
        System.out.println((i > j) | (j > k));//false | false
        System.out.println((i < j) | (j > k));//true | flase
        System.out.println((i > j) | (j < k));//false | true
        System.out.println((i < j) | (j < k));//true | true
        System.out.println("---------------------");
        //^ 两个表达式相同为false，不同为true
        System.out.println((i > j) ^ (j > k));//false ^ false
        System.out.println((i < j) ^ (j > k));//true ^ flase
        System.out.println((i > j) ^ (j < k));//false ^ true
        System.out.println((i < j) ^ (j < k));//true ^ true
        System.out.println("---------------------");
        //!非
        System.out.println((i > j));//false
        System.out.println(!(i > j));//!false
        System.out.println(!!(i > j));//!!false
        System.out.println(!!!(i > j));//!!!false
        System.out.println("---------------------");
        */
        //&& 两个表达式有false则false
        System.out.println((i > j) && (j > k));//false && false
        System.out.println((i < j) && (j > k));//true && flase
        System.out.println((i > j) && (j < k));//false && true
        System.out.println((i < j) && (j < k));//true && true
        System.out.println("---------------------");
        //|| 两个表达式有true则true
        System.out.println((i > j) || (j > k));//false || false
        System.out.println((i < j) || (j > k));//true || flase
        System.out.println((i > j) || (j < k));//false || true
        System.out.println((i < j) || (j < k));//true || true
        System.out.println("---------------------");
        //&和&&
        System.out.println((i++ > 100) & (j++ > 100));//false & false
        //System.out.println((i++ > 100) && (j++ > 100));//false && false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("---------------------");

        //|和||
        System.out.println((i++ > 100) | (j++ > 100));//false | false
        //System.out.println((i++ > 100) || (j++ > 100));//false || false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("---------------------");
    }
}
