/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_17_04_2025;

/**
 *
 * @author ACER
 */
public class Transport {
    public String name;
    public int prodYear;
    
    public Transport(){
        name = "Default";
        prodYear = 2000;
    }
    
    public Transport(String name, int prodYear){
        this.name = name;
        this.prodYear = prodYear;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getProdYear(){
        return prodYear;
    }
    
    public void setProdYear(int year){
        this.prodYear = year;
    }
    
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Production Year: " + prodYear);
    }
}
