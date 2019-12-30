package vip.liandao.javabasis.controller;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.*;

public class UseBasicType {
    public static void main(String[] args) {
        // 强引用
        String str = "aaa";
        List<String> list = new ArrayList<>();
        list.add(str);
        System.out.println("list = " + list.toString());

        // 软引用
        System.out.println("start");
        A a = new A();
        SoftReference<A> sr = new SoftReference<A>(a);
        a = null;
        // 类似缓存用法
        if(sr!=null){
            a = sr.get();
        } else{
            a = new A();
            sr = new SoftReference<A>(a);
        }
        System.out.println("end");
    }
}

class A {
    int[] x;
    public A () {
        x = new int[80000000];
    }
}