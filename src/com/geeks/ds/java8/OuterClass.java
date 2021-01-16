package com.geeks.ds.java8;

public class OuterClass {

    private String xyz;

    public  void test1(){
        //abc = "";
    }


    class InnerClass {
        public String abc;

        public void test(){
            abc = "";
            xyz = "";
        }
    }
}
