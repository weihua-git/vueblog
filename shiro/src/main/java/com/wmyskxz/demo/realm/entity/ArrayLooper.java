package com.wmyskxz.demo.realm.entity;


import javafx.util.Callback;

public class ArrayLooper {
    private Integer[] array;

    public ArrayLooper(Integer[] array) {
        this.array = array;
    }

    public void handle(Callback action) {
        for (Integer num : array) {
            action.call(num);
        }
    }
}