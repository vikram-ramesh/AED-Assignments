/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configure;

import Business.Business;
import Business.LoadCsvData.LoadCsvFiles;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import java.io.IOException;
import jxl.read.biff.BiffException;

/**
 *
 * @author Varun
 */
public class ConfigureABusiness {
 
    public static Business Initialize() throws IOException, BiffException{
    
        Business b = new Business();
        Business b1 = LoadCsvFiles.loadCsv(b);
        
        UserAccountDirectory uad = b1.getUserAccountDirectory();
        
        UserAccount ua= uad.addUserAccount();
        ua.setAccountStatus(true);
        ua.setRole("System Admin");
        ua.setUsername("admin");
        ua.setPassword("password");
        
           
        
        
       return b1;
    }
}
