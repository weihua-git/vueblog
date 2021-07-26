package com.wmyskxz.demo.realm.entity;

import java.util.function.Consumer;
import java.util.function.Supplier;

public  class Student {
    private int number;
    private String name;
    private int score;

    public Student(int number, String name, int score) {
        this.number = number;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s : %d", getNumber(), getName(), getScore());
    }


    public static void main(String[] args) {


        // 静态方法引用--通过类名调用
        Consumer<String> consumerStatic = Java3y::MyNameStatic;
        consumerStatic.accept("3y---static");

        //实例方法引用--通过实例调用
        Java3y java3y = new Java3y();
        Consumer<String> consumer = java3y::myName;
        consumer.accept("3y---instance");

        // 构造方法方法引用--无参数
        Supplier<Java3y> supplier = Java3y::new;
        System.out.println(supplier.get());




    }
}