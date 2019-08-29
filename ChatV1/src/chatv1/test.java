/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatv1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author dii
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ImageIcon BG = new ImageIcon("D:\\ChatV1\\ChatV1\\src\\resources\\MineBackground.jpg");
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel();
        textLabel.setPreferredSize(new Dimension(720, 480));
        textLabel.setIcon(BG);
        frame.add(textLabel);
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        JTextArea field1 = new JTextArea("asdsdasdasdasdasd");

        Color c = new Color(1f, 1f, 1f, .2f);
        field1.setBackground(c);
        field1.setForeground(null);
        frame.add(field1);
        frame.setVisible(true);

    }

}
