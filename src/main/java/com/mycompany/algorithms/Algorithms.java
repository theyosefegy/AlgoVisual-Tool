package com.mycompany.algorithms;

import AlgoGUI.*;


interface SortingAlgorithm {
    static int[] sort(int[] arr) {
        return arr;
    }
}

public class Algorithms {
    
    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty Array...");
            return;
        }
        
        for (int i = 0;i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6,3,7,2,7,8,10,12,65,32,11,54,76};
        
        new MainFrame();
        printArray(BubbleSort.sort(arr));
        printArray(SelectionSort.sort(arr));
        printArray(InsertionSort.sort(arr));


    }
}

