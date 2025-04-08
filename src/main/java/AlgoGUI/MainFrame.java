/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */

public class MainFrame extends JFrame {
    private JPanel toolbarPanel;

    
    
    public MainFrame() {
        setTitle("VisuAlgorithm: Main Window");
        setSize(1025, 700);
        setVisible(true);
        setLayout(new BorderLayout());
        
        toolbarPanel = new ToolbarPanel();
        JPanel mainwindow = new JPanel(new BorderLayout());
        
        VisualArrayPanel ArrayPanel = new VisualArrayPanel();
        visualArrayPanel.setOpaque(false);

        mainwindow.add(visualArrayPanel, BorderLayout.CENTER);
        mainwindow.setBackground(Color.pink);


        add(mainwindow, BorderLayout.CENTER);
        add(toolbarPanel, BorderLayout.SOUTH);
    }
}
