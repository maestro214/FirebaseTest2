package com.example.firebasetest2;

public class UserAccount {

    private String Token;

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    private String emailId;
    private String password;

    public UserAccount(){}

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
