package chatv1;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test {
    static Random rng = new Random();
    
    public static void main(String[] args) {
        Color c = new Color(1f, 1f, 1f, .2f);
        Color b = new Color(1f, 1f, 1f, .5f);
        ImageIcon BG = new ImageIcon("D:\\ChatV1\\ChatV1\\src\\resources\\chat"+rng.nextInt(10)+".jpg");
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel();
        textLabel.setPreferredSize(new Dimension(720, 405));
        textLabel.setIcon(BG);
        textLabel.setOpaque(true);
        
        frame.add(textLabel);
        frame.getContentPane().add(textLabel);
        frame.pack();
        
        JTextArea area1 = new JTextArea();
        area1.setBackground(c);
        area1.setEditable(false);
        area1.setBounds(20,20, 600,300);
        area1.setEditable(false);
        
        JTextField input = new JTextField();
        input.setBackground(b);
        input.setBounds(20,330, 600,50);
        
        
        frame.add(area1);
        frame.add(input);
        
        frame.setVisible(true);

    }

}
