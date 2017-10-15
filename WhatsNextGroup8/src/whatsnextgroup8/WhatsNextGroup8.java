/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnextgroup8;

public class WhatsNextGroup8 {

    public static void main(String[] args) {
        User user = new User();
        LoginUI loginUI= new LoginUI(user);
        LoginCtrl aLoginCtrl = new LoginCtrl(user, loginUI);
    }
    
}
