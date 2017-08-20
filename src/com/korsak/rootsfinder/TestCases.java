package com.korsak.rootsfinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCases {

    public static void main(String[] args) {

        List<Double> f_1 = new ArrayList<>(Arrays.asList(4.0, 8.0));
        List<Double> f_2 = new ArrayList<>(Arrays.asList(2.0, -3.0, 1.0));
        List<Double> f_3 = new ArrayList<>(Arrays.asList(18.0, -11.0, -8.0, 1.0));
        List<Double> f_4 = new ArrayList<>(Arrays.asList(720.0, -1764.0, 1624.0, -735.0, 175.0, -21.0, 1.0));
        List<Double> f_5 = new ArrayList<>(Arrays.asList(58.275, -14.135, -6.17, 1.0));

        test(f_1);
        test(f_2);
        test(f_3);
        test(f_4);
        test(f_5);
    }

    private static void test(List<Double> testCase) {
        CalculateRoots calculateRoots = new CalculateRoots();
        List<Double> results = calculateRoots.getRoots(testCase);
        System.out.println("Test: " + results);
    }
}