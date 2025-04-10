package com.mycompany.algorithms;

import AlgoGUI.Bar;
import java.awt.Color;

public class SelectionSort implements SortAlgorithm {
    @Override
    public Bar[] sort(Bar[] bars, int maxValue) {
        try {
            for (int i = 0; i < bars.length; i++) {
                int minPos = i;
                bars[i].setColor(Color.RED);
                Thread.sleep(500); // mark first element as min (red)

                for (int j = i + 1; j < bars.length; j++) {
                    bars[j].setColor(Color.YELLOW); // iterate all unsorted elements (YELLOW)
                    Thread.sleep(500); 

                    if (j == i) bars[i].setColor(Color.RED);
                    
                    if (bars[j].value < bars[minPos].value) {
                        bars[minPos].setColor(Color.WHITE); // reset old min's color
                        Thread.sleep(300);

                        minPos = j;
                        bars[minPos].setColor(Color.RED); // set the new min's color as red
                        Thread.sleep(400); // keep it red for a bit
                    } else {
                        bars[j].setColor(Color.WHITE);
                    }
                }

                // Swap values
                int temp = (int) bars[i].value;
                bars[i].setValue((int) bars[minPos].value, maxValue);
                bars[minPos].setValue(temp, maxValue);

                // Highlight swap
                bars[i].setColor(Color.ORANGE);
                bars[minPos].setColor(Color.ORANGE);
                Thread.sleep(1000);

                // Mark sorted
                bars[minPos].setColor(Color.WHITE); // unless minPos == i, in which case it's already green
                bars[i].setColor(Color.GREEN);
                Thread.sleep(500);
            }

            // Make sure all are green at end
            for (Bar bar : bars) {
                bar.setColor(Color.GREEN);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return bars;
    }
}