package AlgoGUI;

import java.awt.*;
import javax.swing.*;

public class Bar extends JPanel {
    public int index;
    public int value;
    public int width = 60;
    public Color color;

    private JPanel innerBar; // دي الحته الملونه من البار فعلا
    private JLabel valueLabel;
    private JLabel indexLabel ; 
    

    public Bar(int value, int maxValue, int index) {
        this.value = value;
        this.index = index;

        setPreferredSize(new Dimension(width, 300));
        setBackground(Color.PINK);
        setLayout(new BorderLayout());

        innerBar = new JPanel();

        int heightPercent = (int)((value / (float) maxValue) * 100);
        innerBar.setPreferredSize(new Dimension(width, heightPercent * 3));
        innerBar.setLayout(new BorderLayout());
        innerBar.setBackground(Color.WHITE); 

        add(innerBar, BorderLayout.SOUTH);
        
        
        ////////////////////////////////////////////////////////////////
        valueLabel = new JLabel(String.valueOf((int)value), JLabel.CENTER);
        valueLabel.setForeground(Color.BLACK);  
        valueLabel.setFont(new Font("Monospaced", Font.BOLD, 13));
        ////////////////////////////////////////////////////////////////
        indexLabel = new JLabel(String.valueOf(index), JLabel.CENTER);
        indexLabel.setForeground(Color.BLACK);  
        indexLabel.setFont(new Font("Monospaced", Font.PLAIN, 13));

        innerBar.add(valueLabel, BorderLayout.CENTER);
        innerBar.add(indexLabel, BorderLayout.SOUTH); // Place the index below the bar

    }

    public void setColor(Color color) {
        innerBar.setBackground(color);
        this.color = color;
        repaint();
        validate();
    }
    
    public Color getColor(){
        return this.color;
    }

    public void setValue(int newValue, int maxValue) {
        // the maxValue could change too, since users may add a new element into the array.
        this.value = newValue;
        int heightPercent = (int)((value / (float) maxValue) * 100);
        innerBar.setPreferredSize(new Dimension(width, heightPercent * 3));
        
        valueLabel.setText(String.valueOf(newValue));

        revalidate(); // update layout
        repaint();    // redraw
    }
}
