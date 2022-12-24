import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

class Calculator implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, minus, into, divide, equal, clear, dot, cut, root, square;
    JTextField t1;
    JLabel l1, l2;
    String s1 = "1", s2 = "2", s3 = "3", s4 = "4", s5 = "5", s6 = "6", s7 = "7", s8 = "8", s9 = "9", s10 = "0",
            s11 = "+", s12 = "-", s13 = "*", s14 = "/", s15 = "=", s16 = "clear", str1, str2, lString, textString = "";
    int calcsign;

    Calculator() {
        JFrame f = new JFrame("Simple Calculator");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4));
        p.setBounds(0, 170, 600, 350);
        l1 = new JLabel("Simple CALULATOR", SwingConstants.CENTER);
        l1.setBounds(0, 0, 600, 50);
        l1.setOpaque(true);
        l1.setBackground(Color.cyan);
        l1.setFont(new Font("sarif", Font.BOLD, 20));
        l2 = new JLabel("");
        l2.setBounds(0, 50, 600, 20);
        l2.setOpaque(true);
        l2.setBackground(Color.lightGray);
        l2.setFont(new Font("sarif", Font.BOLD, 20));
        b1 = new JButton(s1);
        b2 = new JButton(s2);
        b3 = new JButton(s3);
        b4 = new JButton(s4);
        b5 = new JButton(s5);
        b6 = new JButton(s6);
        b7 = new JButton(s7);
        b8 = new JButton(s8);
        b9 = new JButton(s9);
        b0 = new JButton(s10);
        plus = new JButton(s11);
        minus = new JButton(s12);
        into = new JButton(s13);
        divide = new JButton(s14);
        equal = new JButton(s15);
        clear = new JButton(s16);
        dot = new JButton(".");
        root = new JButton("sq.root");
        cut = new JButton("backspace");
        square = new JButton("square");
        t1 = new JTextField(textString, SwingConstants.RIGHT);
        t1.setBounds(0, 70, 600, 100);
        t1.setFont(new Font("sarif", Font.BOLD, 50));
        f.add(l1);
        f.add(l2);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(plus);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(minus);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(into);
        p.add(dot);
        p.add(b0);
        p.add(cut);
        p.add(divide);
        p.add(square);
        p.add(root);
        p.add(equal);
        p.add(clear);
        f.add(t1);
        f.add(p);
        f.setDefaultCloseOperation(3);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600, 550);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        into.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
        root.addActionListener(this);
        square.addActionListener(this);
        cut.addActionListener(this);
        dot.addActionListener(this);
    }

    public void actionPerformed(ActionEvent sk) {
        if (sk.getSource() == b1) {
            textString = textString + s1;
            t1.setText(textString);
        }
        if (sk.getSource() == b2) {
            textString = textString + s2;
            t1.setText(textString);
        }
        if (sk.getSource() == b3) {
            textString = textString + s3;
            t1.setText(textString);
        }
        if (sk.getSource() == b4) {
            textString = textString + s4;
            t1.setText(textString);
        }
        if (sk.getSource() == b5) {
            textString = textString + s5;
            t1.setText(textString);
        }
        if (sk.getSource() == b6) {
            textString = textString + s6;
            t1.setText(textString);
        }
        if (sk.getSource() == b7) {
            textString = textString + s7;
            t1.setText(textString);
        }
        if (sk.getSource() == b8) {
            textString = textString + s8;
            t1.setText(textString);
        }
        if (sk.getSource() == b9) {
            textString = textString + s9;
            t1.setText(textString);
        }
        if (sk.getSource() == b0) {
            textString = textString + s10;
            t1.setText(textString);
        }
        if (sk.getSource() == dot) {
            textString = textString + ".";
            t1.setText(textString);
        }
        if (sk.getSource() == plus) {
            str1 = t1.getText();
            calcsign = 1;
            textString = "";
            l2.setText("+");
        }
        if (sk.getSource() == minus) {
            str1 = t1.getText();
            calcsign = 2;
            textString = "";
            l2.setText("-");
        }
        if (sk.getSource() == square) {
            str1 = t1.getText();
            float num = Float.parseFloat(str1);
            t1.setText(num * num + "");
            textString = "";
        }
        if (sk.getSource() == root) {
            str1 = t1.getText();
            float num = Float.parseFloat(str1);
            t1.setText((Math.sqrt(num)) + "");
            textString = "";
        }
        if (sk.getSource() == into) {
            str1 = t1.getText();
            calcsign = 3;
            textString = "";
            l2.setText("*");
        }
        if (sk.getSource() == divide) {
            str1 = t1.getText();
            calcsign = 4;
            textString = "";
            l2.setText("/");
        }
        if (sk.getSource() == cut) {
            String strtemp = textString;
            textString = "";
            for (int i = 0; i < strtemp.length() - 1; i++) {
                textString = textString + strtemp.charAt(i);
            }
            t1.setText(textString);
        }
        if (sk.getSource() == clear) {
            textString = "";
            t1.setText(textString);
            str1 = "";
            str2 = "";
        }
        if (sk.getSource() == equal) {
            str2 = t1.getText();
            float num1, num2, value;
            num1 = Float.parseFloat(str1);
            num2 = Float.parseFloat(str2);
            switch (calcsign) {
                case 1:
                    value = num1 + num2;
                    textString = value + "";
                    break;
                case 2:
                    value = num1 - num2;
                    textString = value + "";
                    break;
                case 3:
                    value = num1 * num2;
                    textString = value + "";
                    break;
                case 4:
                    value = num1 / num2;
                    textString = value + "";
                    break;
            }
            t1.setText(textString);
            textString = "";
            l2.setText("");
        }
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}