package AlgoGUI;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel toolbarPanel;

    public MainFrame() {
        setTitle("VisuAlgo");
        setSize(1045, 700);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.pink);
        
        
        JPanel mainwindow = new JPanel();
        mainwindow.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));  // FlowLayout with center alignment

        // array used for visualization 
        int[] arr = Utils.generateRandomArr(9, 200);
        
        VisualArrayPanel arrPanel = new VisualArrayPanel(arr);
        arrPanel.setPreferredSize(new Dimension(getWidth() - getWidth() / 3, getHeight() - getHeight()/3));
        
        toolbarPanel = new ToolbarPanel(arrPanel);

        
        arrPanel.setBackground(Color.PINK);
        mainwindow.setBackground(Color.PINK);
        
        mainwindow.add(arrPanel, BorderLayout.SOUTH);        
        add(mainwindow, BorderLayout.CENTER);
        add(toolbarPanel, BorderLayout.SOUTH);
    }
    
}
