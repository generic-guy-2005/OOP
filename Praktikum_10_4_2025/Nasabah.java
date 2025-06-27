/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27_03_2025;

/**
 *
 * @author ACER
 */
public class Nasabah {
    private String firstName;
    private String lastName;
    private Tabungan tabungan;
    
    public Nasabah(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
    public Tabungan getTabungan(){
       return tabungan;
    }
    
    @Override
    public String toString(){
        if(tabungan != null){
            return firstName + " " + lastName + " - " + tabungan.toString();
        } 
        else {
            return firstName + " " + lastName + " - Tidak ada tabunagn";
        }
    }
}
