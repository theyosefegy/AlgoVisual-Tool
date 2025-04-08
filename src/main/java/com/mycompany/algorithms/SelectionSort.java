
package com.mycompany.algorithms;


public class SelectionSort implements SortingAlgorithm{
    public static int[] sort(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            int minPos = i;
            for (int j=i;j<arr.length;j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            
            // swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        
        return arr;
    }
}
