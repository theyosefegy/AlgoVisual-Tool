package com.mycompany.algorithms;

import AlgoGUI.Bar;
import java.awt.Color;

public class InsertionSort implements SortAlgorithm {
    @Override
    public Bar[] sort(Bar[] bars, int maxValue) {
        try {
            for (int i = 1; i < bars.length; i++) {
                int key = bars[i].value;
                bars[i].setColor(Color.CYAN); // Highlight the key in cyan (the bar being considered)
                Thread.sleep(500); 

                int j = i - 1;

                // Move the bars greater than the key to the right
                while (j >= 0 && bars[j].value > key) {
                    int temp = bars[j+1].value;
                    bars[j + 1].setValue((int) bars[j].value, maxValue); 
                    bars[j + 1].setColor(Color.GREEN); // Mark the moved bar with GREEN
                    bars[j].setColor(Color.RED); // Highlight the key bar in RED
                    bars[j].setValue(temp, maxValue);
                    Thread.sleep(500); 
                    j--;
                }

                bars[j + 1].setValue(key, maxValue);
                bars[j + 1].setColor(Color.GREEN);
                Thread.sleep(500); 

                // Highlight the sorted portion (from index 0 to i) in green
                for (int k = 0; k <= i; k++) {
                    if (bars[k].getColor() != Color.GREEN) {
                        bars[k].setColor(Color.GREEN); // Highlight the sorted part in light green
                    }
                }
            }

            // Final loop to ensure all sorted bars are green
            for (Bar b : bars) {
                if (b.getColor() != Color.GREEN) {
                    b.setColor(Color.GREEN); // Ensure final bars are green
                    b.repaint();
                    Thread.sleep(100); // Slight delay to visualize the final result
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return bars;
    }
}
