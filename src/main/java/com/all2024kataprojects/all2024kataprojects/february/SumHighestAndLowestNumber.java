package com.all2024kataprojects.all2024kataprojects.february;

import java.util.Arrays;

public class SumHighestAndLowestNumber {
    public static void main(String[] args) {

        int[] my = new int[]{ 6, 2, 1, 8, 10};

        System.out.println(sum(my));
    }

    public static int sum(int[] numbers) {

        int[] one = Arrays.stream(numbers).sorted().toArray();

        int a = Arrays.stream(one).sum() - (one[0] + one[one.length-1]);

        if(a > 0 || numbers.length <= 1) {
            return a;
        } else return 0;
    }

}