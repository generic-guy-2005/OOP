/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_24_04_2025;

/**
 *
 * @author ACER
 */
public class Silinder extends Lingkaran {
    private double tinggi;
    
    public Silinder(){
        
    }
    
    public Silinder(double r, double t){
        super(r);
        this.tinggi = t;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double getVolume(){
        return Math.PI * super.getR() * super.getR() * tinggi;
    }
    
    @Override
    public String toString(){
        return "Informasi Silinder\nRadius: " + super.getR() +
                "\nTinggi: " + tinggi +
                "\nVolume: " + getVolume() +
                "\nLuas Selimut: " + getLuas();
    }
    
    @Override
    public double getLuas(){
        return 2 * Math.PI * super.getR() * tinggi;
    }
}
