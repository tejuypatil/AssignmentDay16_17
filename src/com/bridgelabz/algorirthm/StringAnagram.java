package com.bridgelabz.algorirthm;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static boolean checkAnagram(String s1,String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        //if length of the both strings are not same then they cannot be anagram

        if (n1 != n2)
            return false;

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        //sort both strings
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0; i < n1; i++)
            if(charArray1[i] != charArray2[i])
                return false;
        return  true;

    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second String : ");
        String s2 = scanner.nextLine();
        if (checkAnagram (s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        } else
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
        scanner.close();
    }

}
