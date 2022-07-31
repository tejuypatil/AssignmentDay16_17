package com.bridgelabz.algorirthm;

public class BubbleSort {

    static void bubbleSort(int[] array){
        int number = array.length;;
        int temp = 0;
        for (int i = 0; i <number ; i++) {
            for (int j = 1; j <(number-i) ; j++) {
                if(array[j-1]> array[j]){
                   temp = array[j-1];
                   array[j-1] = array[j];
                   array[j] = temp;
                }

            }

        }
    }
    public static void main(String[] args) {
        int array[] = {10,30,60,90,20,50};
        for (int i = 0; i < array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("Array after bubble sort :");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");

        }
    }

}
