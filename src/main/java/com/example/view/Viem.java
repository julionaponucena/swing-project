package com.example.view;


import javax.swing.*;

import com.example.interfaces.IVem;
import com.example.interfaces.IVemState;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

public class Viem implements IVem {
    private JFrame jFrame;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private JLabel jLabel2;
    private IVemState viemState;

    public  Viem(IVemState viemState){
        this.viemState = viemState;
        this.initComponents();
    }

    private void initComponents(){
        this.jFrame = new JFrame();
        Container panel = this.jFrame.getContentPane();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        panel.setPreferredSize(new Dimension(700,520));
        this.jFrame.setLocationRelativeTo(null);
        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jLabel = new JLabel("Digite o número inicial: ");
        this.jLabel.setBackground(Color.blue);
        this.jTextField = new JTextField();
        this.jLabel2=new JLabel();
        this.jTextField.setPreferredSize(new Dimension(300,25));
        this.jTextField.setBackground(Color.green); 
        this.jButton = new JButton("Salvar");
        this.jButton.setBackground(Color.CYAN);
        layout.putConstraint(SpringLayout.NORTH, jLabel,30,SpringLayout.NORTH,panel);
        layout.putConstraint(SpringLayout.WEST, jTextField, 20, SpringLayout.EAST, jLabel);
        layout.putConstraint(SpringLayout.NORTH, jTextField, 0, SpringLayout.NORTH, jLabel);
        layout.putConstraint(SpringLayout.NORTH, jLabel2, 20, SpringLayout.SOUTH, jLabel);
        layout.putConstraint(SpringLayout.WEST, jLabel2, 50, SpringLayout.EAST, jLabel);
        layout.putConstraint(SpringLayout.WEST, jButton,40, SpringLayout.EAST, jLabel2);
        layout.putConstraint(SpringLayout.NORTH, jButton, 0, SpringLayout.NORTH, jLabel2);
        panel.add(jLabel);
        panel.add(jTextField);
        panel.add(jButton);
        panel.add(jLabel2);
        this.jFrame.pack();
        this.jFrame.setVisible(true);
    }

    public void update (){
        this.jLabel2.setText(viemState.getTexto());
    }

    public JButton getjButton() {
        return this.jButton;
    }
}
