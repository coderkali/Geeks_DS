package com.geeks.ds.java8;

public class ForLoopTest {

    public static void main(String[] args) {
        int i=0, j =12;
        for (;;){
            if(i++ < j--){
                continue;
            }else{
                break;
            }
            //System.out.println(i+" "+j);
        }
    }
}
