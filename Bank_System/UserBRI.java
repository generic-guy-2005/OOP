/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author acer
 */
public class UserBRI extends User {
    private String transferLog[];
    
    public UserBRI(String name, String password, int balance, String bankName){
        super(name, password, balance, bankName);
    }

    public String[] getTransferLog() {
        return transferLog;
    }

    public void setTransferLog(String log, int logId) {
        this.transferLog[logId] = log;
    }
    
    @Override
    public int limitTransfer(){
        return 10000000;
    }
}
