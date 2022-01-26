/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author dell
 */
public class User {
 
    private String USERNAME;
    private String PASSWORD;
    private String EMAIL;
    private double BALANCE;

    public User(String USERNAME, String PASSWORD, String email) {
        this.USERNAME = USERNAME;
        this.EMAIL = email;
        this.PASSWORD = PASSWORD;
    }
    public User(String USERNAME, String PASSWORD) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    public User(String USERNAME, double BALANCE) {
        this.USERNAME = USERNAME;
        this.BALANCE = BALANCE;
    }
    
    public User(double BALANCE) {
        this.BALANCE = BALANCE;
    }

    public double getBALANCE() {
        return BALANCE;
    }
    

    public String getUsername() {
        return USERNAME;
    }

    public void setUsername(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getEmail() {
        return EMAIL;
    }

    public void setEmail(String email) {
        this.EMAIL = email;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public void setPassword(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
    
    
}
