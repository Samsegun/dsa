package com.datastructures;

public class ArrayTuts {

    public static void main(String[] args) {
        int[] myArray = {5,1,9,2,10};
        int[] myArray2 = {2,4, 17, 323,5,8, 1,0};
        printArray(myArray);
        printArray(removeEvenArray(myArray2));
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeEvenArray(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount];
        int oddCurrIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddArray[oddCurrIdx] = arr[i];
                oddCurrIdx++;
            }
        }

        return oddArray;
    }
}
