package com.tlgjavaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CodebreakerGui implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JTextField textField;
    private JLabel label;
    private int count = 0;


    CodebreakerGui(){
        
        frame = new JFrame();

        button = new JButton("Submit");
        button.addActionListener(this);
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10 ,30));
        panel.setLayout(new FlowLayout());
        panel.add(button);
        panel.add(textField);
        panel.setVisible(true);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CodeBreaker!");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CodebreakerGui();
    }

    @Override
    public void actionPerformed(ActionEvent e){
    }

}
