/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_17_04_2025;

/**
 *
 * @author ACER
 */
public class Plane extends Steam{
    private int load;
    
    public Plane(){
        load = 100;
    }
    
    public Plane(String name, int prodYear, boolean machine, int load){
        super(name, prodYear, machine);
        super.prodYear = prodYear;
        this.load = load;
    }
    
    public int getLoad(){
        return load;
    }
    
    public void setLoad(int load){
        this.load = load;
    }
    
    public void reset(String name, int year, boolean machine, int load){
        setName(name);
        setProdYear(prodYear);
        setMachine(machine);
        setLoad(load);
    }
    
    public String category(int load){
        if(load <= 50){
            return "Light";
        }
        else if(load <= 100){
            return "Medium";
        }
        else{
            return "Heavy";
        }
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Passenger: " + load);
        System.out.println("Classification: " + category(load));
    }
}
