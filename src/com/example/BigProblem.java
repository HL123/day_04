package com.example;

import java.math.BigInteger;

/**
 * Created by huanglei on 17/4/10.
 */
public class BigProblem {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("5000");
        BigInteger b = new BigInteger("1000");
        BigInteger c = BigInteger.ZERO;
        c = c.add(a);
        c = c.add(b);
        System.out.println(c);
    }

}
