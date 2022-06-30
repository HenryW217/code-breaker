package com.tlgjavaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class CodebreakerGui implements ActionListener {

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
        textField.setFont( new Font("Times New Roman", Font.PLAIN, 20));
        textField.setForeground(Color.blue);
        textField.setCaretColor(Color.black);
        textField.setText("Enter your guess");

        label = new JLabel("Welcome to CodeBreak! Think you can crack the code?");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10 ,50));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(textField);
        panel.add(button);
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
        if(e.getSource()==button) {
            System.out.println("Welcome " + textField.getText());
        }
    }

}