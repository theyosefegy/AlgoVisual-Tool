/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithms;

public class AlgorithmFactory {
    public static SortAlgorithm createAlgorithmInstance(String algorithm) {
        switch (algorithm) {
            case "bubblesort":
                return new BubbleSort();
            case "selectionsort":
                return new SelectionSort();
            case "insertionsort":
                return new InsertionSort();
        }
        return null;
    }
}
