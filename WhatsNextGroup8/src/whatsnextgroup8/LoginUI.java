package whatsnextgroup8;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame{
    private User user;
    private JLabel welcomeLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JTextField passwordField;
    JButton loginButton;
    JButton newUserButton;
    private String username;
    private String password;
    
    public LoginUI() {        
        
        setTitle("What's Next");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(Color.BLACK);
        validate();
        add(loginPanel);
        setVisible(true);
        setResizable(true);
        
        GridLayout panelLayout = new GridLayout(0,1);
        loginPanel.setLayout(panelLayout);
        
        welcomeLabel = new JLabel("Welcome to What's Next!");
            welcomeLabel.setForeground(Color.WHITE);
            welcomeLabel.setFont(new Font("Serif", 40, 40));
        usernameLabel = new JLabel("Enter username:");
            usernameLabel.setForeground(Color.WHITE);
            usernameLabel.setFont(new Font("Serif", 30, 30));
        passwordLabel = new JLabel("Enter password:");
            passwordLabel.setForeground(Color.WHITE);
            passwordLabel.setFont(new Font("Serif", 30, 30));
        
        usernameField = new JTextField(20);
        passwordField = new JTextField(20);
        
        loginButton = new JButton("LOG IN!");
        newUserButton = new JButton("Create a new account");
        
        loginPanel.add(welcomeLabel);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(newUserButton);
        
        revalidate();
        
    }
        public void addLoginButtonListener(ActionListener al){
            loginButton.addActionListener(al);
        }
        
        public void addNewUserButtonListener(ActionListener al) {
            newUserButton.addActionListener(al);
        }
        
        public void setUsername() {
            username = usernameField.getText();
            //User.setUsername(username);
        }
        public String getUsername() {
            //this.username = User.getUsername();
            return this.username;            
        }
        public void setPassword() {
            password = passwordField.getText();
            //User.setPassword(password);
        }
        public String getPassword() {
            //this.password = User.getPassword();
            return this.password;
        }
}
