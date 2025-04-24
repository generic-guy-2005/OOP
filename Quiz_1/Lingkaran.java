/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_24_04_2025;

/**
 *
 * @author ACER
 */
public class Lingkaran {
    private double r;
    
    public Lingkaran(){
        
    }
    
    public Lingkaran(double r){
        this.r = r;
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double getR(){
        return r;
    }
    
    public double getDiameter(){
        return r * 2;
    }
    
    public double getKeliling(){
        return 2 * Math.PI * r;
    }
    
    public double getLuas(){
        return Math.PI * r * r;
    }
    
    @Override
    public String toString(){
        return "Informasi Lingkaran\nRadius: " + r +
                "\nDiameter: " + getDiameter() +
                "\nKeliling: " + getKeliling() +
                "\nLuas: " + getLuas();
    }
}
