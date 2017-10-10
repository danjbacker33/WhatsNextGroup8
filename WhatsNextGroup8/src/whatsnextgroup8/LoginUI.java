/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnextgroup8;

import javax.swing.*;

public class LoginUI {
    public static void LoginUI() {
        JFrame loginFrame = new JFrame("Welcome to What's Next!");
        loginFrame.setSize(400, 400);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel loginPanel = new JPanel();
        loginFrame.add(loginPanel);
        
        loginFrame.setVisible(true);
        
        JLabel welcomeLabel = new JLabel("Welcome to What's Next");
        JLabel usernameLabel = new JLabel("Enter username:");
        JLabel passwordLabel = new JLabel("Enter password:");
        
        JTextField usernameTextField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        
        JButton loginButton = new JButton("LOG IN!");
        
        loginPanel.add(welcomeLabel);
        loginPanel.add(usernameLabel);
        loginPanel.add(passwordLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordField);
        
    }
}
