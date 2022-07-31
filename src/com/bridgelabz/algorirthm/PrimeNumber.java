package com.bridgelabz.algorirthm;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first no:");
        int a= input.nextInt();
        System.out.println("Enter the last range no:");
        int z= input.nextInt();
        int count=0;
        for (int i= a;i<=z;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.print(i +"\t");
        }
    }
}

