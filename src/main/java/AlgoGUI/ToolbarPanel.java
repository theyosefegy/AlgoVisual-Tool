
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
        
        setLayout(new FlowLayout(FlowLayout.CENTER)); // Align buttons to the left

        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JButton selectionSortButton = createButton("Selection Sort");
        JButton insertionSortButton = createButton("Insertion Sort");
        JButton bubbleSortButton = createButton("Bubble Sort");
        JButton resetButton = createButton("Reset");

        add(selectionSortButton);
        add(insertionSortButton);
        add(bubbleSortButton);
        add(resetButton);

        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (visualpanel != null) {
                    visualpanel.runAlgorithm("selectionsort");
                }
            }
        });

        insertionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (visualpanel != null) {
                    visualpanel.runAlgorithm("insertionsort");
                }
            }
        });

        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (visualpanel != null) {
                    visualpanel.runAlgorithm("bubblesort");
                }
            }
        });
        
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (visualpanel != null) {
                    visualpanel.resetArray();
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
