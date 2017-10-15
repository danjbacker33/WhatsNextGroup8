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
    
    public LoginCtrl(User user, LoginUI loginUI)
    {
        this.userList = new UserList();
        this.loginUI = loginUI;
        loginUI.setVisible(true);
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == loginUI.loginButton) {
                    loginUI.setUsername();
                    loginUI.setPassword();
                }
                if(clickSource == loginUI.newUserButton) {
                    
                }
            }
        }
        loginUI.addLoginButtonListener(new ButtonListener());
        loginUI.addNewUserButtonListener(new ButtonListener());
    }
    
    public boolean requestAuthenticate(String username, String password)
    {
        for(User u:userList.getTheList())
        {
            if(username.equals(u.getUsername()))
            {
                if(password.equals(u.getPassword()))
                {
                    navCtrl = new NavCtrl();
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
