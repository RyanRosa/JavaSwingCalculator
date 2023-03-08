package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorUi extends JFrame{
    private JPanel painel;
    private JButton btn5;
    private JButton btn8;
    private JButton btn4;
    private JButton btn7;
    private JButton btn1;
    private JButton btn2;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnAc;
    private JButton btnResult;
    private JButton btnAddition;
    private JButton btnSubtraction;
    private JButton btn0;
    private JButton btnMultiplication;
    private JButton btnDivision;
    private JButton btnC;
    private JButton btnPoint;
    private JTextField textResult;
    private Double value;
    private String operator;

public CalculatorUi() {
    initComponents();
    addListeners();
}
    private void initComponents() {
        JPanel telaCalc = new JPanel();
        setSize(280, 300);
        setContentPane(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setVisible(true);
}
    private void addListeners() {
        //Numbers
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "9");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + "0");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textResult.getText() + ",");
            }
        });

        //Clear
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("");
            }
        });
        btnAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("");
                value = null;
            }
        });

        //Operations
        btnAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(textResult.getText());
                textResult.setText("");
                operator = "+";
            }
        });
        btnSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(textResult.getText());
                textResult.setText("");
                operator = "-";
            }
        });
        btnMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(textResult.getText());
                textResult.setText("");
                operator = "*";
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(textResult.getText());
                textResult.setText("");
                operator = "/";
            }
        });

        //Result
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator){
                    case "+":
                        textResult.setText(String.valueOf(value + Double.parseDouble(textResult.getText())));
                        break;
                    case "-":
                        textResult.setText(String.valueOf(value - Double.parseDouble(textResult.getText())));
                        break;
                    case "*":
                        textResult.setText(String.valueOf(value * Double.parseDouble(textResult.getText())));
                        break;
                    case "/":
                        textResult.setText(String.valueOf(value / Double.parseDouble(textResult.getText())));
                        break;
                }
            }
        });
    };
}

