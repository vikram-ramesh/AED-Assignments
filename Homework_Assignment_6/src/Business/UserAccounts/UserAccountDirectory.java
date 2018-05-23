/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userList;

    public UserAccountDirectory() {
        userList = new ArrayList<UserAccount>();
    }
    
    public UserAccount addUserAccount(){
    UserAccount userAccount = new UserAccount();
    userList.add(userAccount);
    return userAccount;
    }
    
    public void removeUserAccount(UserAccount user){
    userList.remove(user);
    }

    public ArrayList<UserAccount> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<UserAccount> userList) {
        this.userList = userList;
    }
    
    
    public UserAccount isValidUser(String username, String password){
        for (UserAccount userAccount : userList) {
            if(username.equals(userAccount.getUsername())){
            if(password.equals(userAccount.getPassword())){
            return userAccount;
            }
            }
        }
        return null;
    }
}
