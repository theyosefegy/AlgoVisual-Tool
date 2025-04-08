/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoGUI;

import java.awt.*;
import javax.swing.*;

public class VisualArrayPanel extends JPanel {
    public VisualArrayPanel(int [] arr) {
        setLayout(new GridLayout(1, arr.length, 10, 0));
        setBackground(Color.PINK);

    }
    
}
