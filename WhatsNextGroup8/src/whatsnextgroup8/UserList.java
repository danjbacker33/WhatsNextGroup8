/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnextgroup8;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class UserList {
 
    ArrayList<User> theList;
    public UserList()
    {
        theList = new ArrayList();
    }
    
    public void addUsers(User user)
    {
        theList.add(user);
    }
}
