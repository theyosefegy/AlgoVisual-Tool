package com.mycompany.algorithms;

import AlgoGUI.Bar;
import java.awt.Color;

public class BubbleSort implements SortAlgorithm {
    @Override
    public Bar[] sort(Bar[] bars, int maxValue) {
        int lastSortedElement = bars.length - 1;

        try {
            while (lastSortedElement > 0) {
                boolean swapped = false;
                for (int i = 0; i < lastSortedElement; i++) {
                    // Highlight the bars being compared
                    bars[i].setColor(Color.RED);
                    bars[i + 1].setColor(Color.RED);
                    Thread.sleep(300); // animation delay

                    if (bars[i].value > bars[i + 1].value) {
                        bars[i].setColor(Color.yellow);
                        bars[i+1].setColor(Color.yellow);
                        Thread.sleep(900);
                        
                        float tempVal = bars[i].value;
                        bars[i].setValue((int) bars[i + 1].value, maxValue);
                        bars[i + 1].setValue((int) tempVal, maxValue);
                        swapped = true;
                        
                    }

                    // Reset the color
                    bars[i].setColor(Color.WHITE);
                    bars[i + 1].setColor(Color.WHITE);
                }

                bars[lastSortedElement].setColor(Color.GREEN); // mark as sorted
                lastSortedElement--;

                if (!swapped) break;
            }

            // Final bar is also sorted
            for (Bar b: bars) {
                b.setColor(Color.GREEN);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return bars;
    }
}
