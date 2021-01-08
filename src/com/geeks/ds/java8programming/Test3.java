package com.geeks.ds.java8programming;

public class Test3 {

    static int total =10;

    public void call(){
        int total = 5;
        System.out.println(this.total);
    }

    public static void main(String[] args) {
        Test3 test = new Test3();
        test.call();
    }
}
