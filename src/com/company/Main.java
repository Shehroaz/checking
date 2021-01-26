package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger bitmap = BigInteger.ZERO;
        bitmap = bitmap.setBit(128 - 3);
        bitmap = bitmap.setBit(128 - 7);
        bitmap = bitmap.setBit(128 - 11);
        bitmap = bitmap.setBit(128 - 1);
        String strBitmap = bitmap.toString(2);
        System.out.println(strBitmap);
        String req = "0800822000000000000004000000000000000122115830834624001";
        String res = "sherry081082200000020000000400000000000000012508402683462";
        System.out.println("req " + req.length());
        System.out.println("res " + res.length());
        String name = "1234567";
        System.out.println(name.substring(1, 6));


    }
}
