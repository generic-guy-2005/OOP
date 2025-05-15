/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_15_5_2025;

/**
 *
 * @author acer
 */
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public Kendaraan(int jmlRoda, String warna){
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }
    
    public void setJmlRoda(int roda){
        jmlRoda = roda;
    }
    
    public int getJmlRoda(){
        return jmlRoda;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public String display(){
        return jmlRoda + " | " + warna;
    }
}
