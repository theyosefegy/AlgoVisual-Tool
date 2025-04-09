/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolbarPanel extends JPanel {
    VisualArrayPanel visualpanel;
    
    public ToolbarPanel(VisualArrayPanel visualpanel) {
        this.visualpanel = visualpanel;
        
        // Set the layout for the toolbar (FlowLayout arranges components in a row)
        setLayout(new FlowLayout(FlowLayout.CENTER)); // Align buttons to the left

        // Set the background color and border of the toolbar
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Create buttons for sorting algorithms
        JButton selectionSortButton = createButton("Selection Sort");
        JButton insertionSortButton = createButton("Insertion Sort");
        JButton bubbleSortButton = createButton("Bubble Sort");

        // Add buttons to the toolbar
        add(selectionSortButton);
        add(insertionSortButton);
        add(bubbleSortButton);

        // Add action listeners for button clicks
        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder action for selection sort button
                System.out.println("Selection Sort button clicked");
            }
        });

        insertionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder action for insertion sort button
                System.out.println("Insertion Sort button clicked");
            }
        });

        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (visualpanel != null) {
                    visualpanel.runSort("bubble");
                }
            }
        });
    }
    
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Monospaced", Font.PLAIN, 15));
        button.setPreferredSize(new Dimension(150, 30));
        button.setBackground(Color.GRAY); 
        button.setForeground(Color.WHITE); 
        button.setFocusPainted(false);  // Remove the focus border when clicked
        button.setBorder(BorderFactory.createEmptyBorder());  
        return button;
    }
}
