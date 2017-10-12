/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnextgroup8;

/**
 *
 * @author mattb
 */
public class LoginCtrl {
    
    private UserList aUserList;
    private LoginUI aLoginUI;
    private NavCtrl aNavCtrl;
    
    public LoginCtrl()
    {
        aUserList = new UserList();
        aLoginUI = new LoginUI();
        aLoginUI.setVisible(true);
    }
    
    public boolean requestAuthenticate(String username, String password)
    {
        for(User u:aUserList.getTheList())
        {
            if(username.equals(u.getUsername()))
            {
                if(password.equals(u.getPassword()))
                {
                    aNavCtrl = new NavCtrl();
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
