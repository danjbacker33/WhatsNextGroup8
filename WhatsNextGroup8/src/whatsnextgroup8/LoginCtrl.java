/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnextgroup8;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JButton;
/**
 *
 * @author mattb
 */
public class LoginCtrl {
    
    private UserList userList;
    private LoginUI loginUI;
    private NavCtrl navCtrl;
    private User user;
    
    public LoginCtrl(LoginUI loginUI)
    {
        this.userList = new UserList(); // Initializes List
        this.loginUI = loginUI;
        loginUI.setVisible(true);
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed");
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == loginUI.loginButton) {
                    loginUI.setUsername();
                    loginUI.setPassword();
                    String testU = loginUI.getUsername();   
                    String testP = loginUI.getPassword();   
                    System.out.println(requestAuthenticate(testU, testP));
                }
                if(clickSource == loginUI.newUserButton) {
                    
                }
            }
        }
        loginUI.addLoginButtonListener(new ButtonListener());
        loginUI.addNewUserButtonListener(new ButtonListener());
    }
    
    public boolean requestAuthenticate(String authUsername, String authPassword)
    {
        for(User u:userList.getTheList())
        {
            if(authUsername.equals(u.getUsername()))
            {
                System.out.println("Username checked");
                if(authPassword.equals(u.getPassword()))
                {
                   System.out.println("Password checked"); 
                    navCtrl = new NavCtrl();
                    loginUI.setVisible(false);
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
