/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnextgroup8;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class LoginUI extends JFrame{
    
    public LoginUI() {
        JFrame loginFrame = new JFrame("Welcome to What's Next!");
        loginFrame.setSize(600,600);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(Color.BLACK);
        loginFrame.validate();
        loginFrame.add(loginPanel);
        loginFrame.setVisible(true);
        loginFrame.setResizable(true);
        
        GridLayout panelLayout = new GridLayout(0,1);
        loginPanel.setLayout(panelLayout);
        
        JLabel welcomeLabel = new JLabel("Welcome to What's Next");
            welcomeLabel.setForeground(Color.WHITE);
            welcomeLabel.setFont(new Font("Serif", 40, 40));
        JLabel usernameLabel = new JLabel("Enter username:");
            usernameLabel.setForeground(Color.WHITE);
            usernameLabel.setFont(new Font("Serif", 30, 30));
        JLabel passwordLabel = new JLabel("Enter password:");
            passwordLabel.setForeground(Color.WHITE);
            passwordLabel.setFont(new Font("Serif", 30, 30));
        
        JTextField usernameTextField = new JTextField(20);
        JTextField passwordField = new JTextField(20);
        
        JButton loginButton = new JButton("LOG IN!");
            //loginButton.setBackground(Color.BLUE);
            //loginButton.setFont(new Font("Serif", 50, 50));
        JButton  newUserButton = new JButton("Create a new account");
        
        loginPanel.add(welcomeLabel);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(newUserButton);
        
        loginFrame.revalidate();
        
    }
}
