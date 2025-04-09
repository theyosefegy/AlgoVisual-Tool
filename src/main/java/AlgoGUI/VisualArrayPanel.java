/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoGUI;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class VisualArrayPanel extends JPanel {
    
    public VisualArrayPanel(int [] arr) {
        setLayout(new GridLayout(1, arr.length, 20, 0));
        setBackground(Color.PINK);
        
        int max = Arrays.stream(arr).max().orElse(1);
        
        for (int i=0;i<arr.length;i++) {
            Bar newBar = new Bar(arr[i], max, i);
            add(newBar);
        }
    }
}
