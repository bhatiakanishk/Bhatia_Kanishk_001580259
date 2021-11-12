/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kanishk
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccntLst;

    public UserAccountDirectory() {
        userAccntLst = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccntLst;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccntLst)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public boolean verifyUserLogin(String uname, String pass){
        for(UserAccount ua: userAccntLst)
            if(ua.getUsername().equals(uname) && ua.getPassword().equals(pass)){
                return true;
            }
        return false;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccntLst.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccntLst){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
