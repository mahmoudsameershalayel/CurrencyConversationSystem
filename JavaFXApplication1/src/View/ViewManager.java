/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author 97059
 */
public class ViewManager {
    public static LoginPage logPage;
    public static SystemPage systemPage;
    private ViewManager(){}
    
    public static void openLoginPage() throws IOException{
        if(logPage == null){
            logPage = new LoginPage();
            logPage.show();
        }else{
           logPage.show();
        }
    }
    public static void closeLoginPage(){
        if(logPage!= null){
            logPage.close();
        }
    }
    public static void openSystemPage() throws IOException{
        if(systemPage == null){
            systemPage = new SystemPage();
            systemPage.show();
        }else{
           logPage.show();
        }
    }
    public static void closeSystemPage(){
        if(systemPage!= null){
            systemPage.close();
        }
    }
}
