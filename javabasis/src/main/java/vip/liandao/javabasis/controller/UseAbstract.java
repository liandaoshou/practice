package vip.liandao.javabasis.controller;

import java.text.DecimalFormat;
import java.util.Random;

public class UseAbstract {
    public static void main(String[] args) {
        System.out.println("args = " + getRandDouble1());

    }

    public static double getRandDouble1() {
        DecimalFormat dcmFmt = new DecimalFormat("0.00");
        Random rand = new Random();
        return Double.valueOf(dcmFmt.format(rand.nextFloat()));
    }
}

abstract class x {
    abstract void y();

    void z() {
        System.out.println("zz");
    }
}

class a extends x{

    @Override
    void y() {
        System.out.println("yy");
    }

//    void z() {
//        System.out.println("2zz");
//    }
}

