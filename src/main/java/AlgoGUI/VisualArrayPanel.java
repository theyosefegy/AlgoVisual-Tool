

package AlgoGUI;

import com.mycompany.algorithms.*;
import java.awt.*;
import java.util.Arrays;
import javax.swing.*;


public class VisualArrayPanel extends JPanel {
    Bar[] bars;
    SortAlgorithm sortingAlgorithm;
    
    public VisualArrayPanel(int [] arr) {
        setLayout(new GridLayout(1, arr.length, 20, 0));
        setBackground(Color.PINK);
        
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
    
    public void runSort(String type) {
        new Thread(()-> {
            sortingAlgorithm = SortingFactory.createSortingAlgorithm(type);
            sortingAlgorithm.sort(bars, getMaxValue());
        }).start();
    }

}
