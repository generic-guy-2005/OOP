/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_26_06_2025;

/**
 *
 * @author acer
 */
public class User {
    private String username;
    private String passKey;
    private double balance = 100000; // Wes malas deposit teross
    public static User[] users = new User[100]; // Dah bingung, kasi aeelah static biar immediate access
    
    public User(String username, String passKey){
        this.username = username;
        this.passKey = passKey;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassKey() {
        return passKey;
    }

    public void setPassKey(String passKey) {
        this.passKey = passKey;
    }
    
    public User[] getUsers(){
        return users;
    }
}
