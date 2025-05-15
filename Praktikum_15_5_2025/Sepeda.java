/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_15_5_2025;

/**
 *
 * @author acer
 */
public class Sepeda extends Kendaraan {
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(int jmlRoda, String warna, String jmlSadel, int jmlGir){
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    
    public void setJmlSadel(String jmlSadel){
        this.jmlSadel = jmlSadel;
    }
    
    public String getJmlSadel(){
        return jmlSadel;
    }
    
    public void setJmlGir(int jmlGir){
        this.jmlGir = jmlGir;
    }
    
    public int getJmlGir(){
        return jmlGir;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + jmlSadel + " | " + jmlGir;
    }
}
