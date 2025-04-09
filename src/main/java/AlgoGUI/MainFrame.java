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
        
        toolbarPanel = new ToolbarPanel();
        
        JPanel mainwindow = new JPanel();
        mainwindow.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));  // FlowLayout with center alignment

        // array used for visualization 
        int[] arr = {5, 34, 45, 7, 12, 45, 20, 8, 10, 12};
        
        VisualArrayPanel arrPanel = new VisualArrayPanel(arr);
        arrPanel.setPreferredSize(new Dimension(getWidth() / 2, getHeight() - getHeight()/3));
        
        arrPanel.setBackground(Color.PINK);
        mainwindow.setBackground(Color.PINK);
        
        mainwindow.add(arrPanel, BorderLayout.SOUTH);        
        add(mainwindow, BorderLayout.CENTER);
        add(toolbarPanel, BorderLayout.SOUTH);
    }
}
