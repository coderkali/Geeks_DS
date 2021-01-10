package com.geeks.ds.java8programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;

public class SystemManager {

    private static String initString;

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("initconfig.txt"));
            initString = reader.lines().findFirst().orElse(null);

        } catch (FileNotFoundException e) {
            throw new NoSuchElementException("File Init  COnfig.txt");
        }


    }

    public SystemManager(){
        if(initString.length() == 0){
            throw new IllegalArgumentException("length is zero");
        }
        System.out.println("It works");
    }

    public static void main(String[] args) {
        SystemManager manager = new SystemManager();
    }


}
