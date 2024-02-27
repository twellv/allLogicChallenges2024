package com.all2024kataprojects.all2024kataprojects.february;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] a = {2,7,11,15,5,8,3,4};
        int b = 10;

        int[] test = solution(a,b);
        Arrays.stream(test).forEach(c -> System.out.print(c));
    }

    public static int[] solution(int[] nums, int target) {
        int[] finalResult = new int[2];


        for (int a = 0; a < nums.length; a++) {

            for(int b = a+1; b < nums.length; b++){

                if((nums[a] + nums[b] == target)){
                    finalResult[0] = b;
                    finalResult[1] = a;
                }

            }

        }
        return finalResult;
    }

}
