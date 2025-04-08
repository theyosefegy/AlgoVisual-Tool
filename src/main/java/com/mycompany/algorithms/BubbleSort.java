/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithms;

/**
 *
 * @author DELL
 */


public class BubbleSort implements SortingAlgorithm{
    public static int[] sort(int[] arr) {
        int lastSortedElement = arr.length - 1;
        while (lastSortedElement > 0) {
            boolean swapped = false;
            for (int i=0;i<lastSortedElement;i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            lastSortedElement--;
            if (!swapped) break;
        }
        return arr;
    }
}
