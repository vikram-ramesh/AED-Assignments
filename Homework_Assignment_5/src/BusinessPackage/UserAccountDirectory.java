/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getuserAccountList() {
        return userAccountList;
    }

    public void setUserAccountDirectory(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount newUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount isValidUser(String userName, String password)
    {
        for (UserAccount user: userAccountList) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password) && user.getStatus().equals("Active")) {
                return user;
            }
        }
        return null;
    }
    
    public UserAccount findUser(String userName){
        for (UserAccount u:userAccountList) {
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        return null;
    }
    
    public void deleteUser(UserAccount ua){
        userAccountList.remove(ua);
    }
}