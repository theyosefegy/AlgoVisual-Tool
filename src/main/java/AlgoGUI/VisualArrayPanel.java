

package AlgoGUI;

import com.mycompany.algorithms.AlgorithmFactory;
import com.mycompany.algorithms.SortAlgorithm;
import java.awt.*;
import java.util.Arrays;
import javax.swing.*;


public class VisualArrayPanel extends JPanel {
    int[] originalArr;
    Bar[] bars;
    SortAlgorithm sortingAlgorithm;
    
    public VisualArrayPanel(int [] arr) {
        setLayout(new GridLayout(1, arr.length, 20, 0));
        setBackground(Color.PINK);
        originalArr = arr;
        
        int max = Arrays.stream(arr).max().orElse(1);
        
        bars = new Bar[arr.length];
        for (int i=0;i<arr.length;i++) {
            bars[i] = new Bar(arr[i], max, i);  // Create a new Bar for each value
            add(bars[i]);
        }
    }
    
    public Bar[] getBars() {
        return bars;
    }

    public int getMaxValue() {
        int max = Integer.MIN_VALUE;
        for (Bar bar : bars) {
            if (bar.value > max) {
                max = (int) bar.value;
            }
        }
        return max;
    }
    
    public void resetArray() {
        for (int i = 0; i < bars.length; i++) {
            bars[i].setValue(originalArr[i], bars[i].maxValue); // Restore original values
            bars[i].setColor(Color.WHITE); // Set color back to default
        }
    }
    
    public void runAlgorithm(String algorithm) {
        new Thread(()-> {
            sortingAlgorithm = AlgorithmFactory.createAlgorithmInstance(algorithm);
            sortingAlgorithm.sort(bars, getMaxValue());
        }).start();
    }

}
