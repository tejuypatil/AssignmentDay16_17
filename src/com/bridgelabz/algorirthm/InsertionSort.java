package com.bridgelabz.algorirthm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        String[] wordArray = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("Original Array:"+ Arrays.toString(wordArray));

        for (int i = 1; i < wordArray.length-1 ; i++) {
            String temp = wordArray[i];
            int j = i-1;

            while (j>=0 && temp.compareTo(wordArray[j]) <=0){
                wordArray[j+1] = wordArray[j];
                j=j-1;
            }
            wordArray[j+1] = temp;

        }
        System.out.println("Sorted Array:"+Arrays.toString(wordArray));
    }
}
