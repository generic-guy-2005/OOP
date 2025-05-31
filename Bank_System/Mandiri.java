/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author acer
 */
public class Mandiri extends Bank implements BRIBehavior {
    private int interest;
    
    public Mandiri(String name){
        super(name);
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
    
    @Override
    public void eduSaving(boolean edu){
        if(edu){
            this.interest = 0;
        }
    }
    
    @Override
    public void regSaving(boolean reg){
        if(reg){
            this.interest = 1000;
        }
    }
    
    @Override
    public int transferFee(){
        return 1500;
    }
    
    @Override
    public String virtualAccount(){
        return "264215297";
    }
    
}
