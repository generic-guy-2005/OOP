/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_17_04_2025;

/**
 *
 * @author ACER
 */
public class Steam extends Transport{
    private boolean machine;
    
    public Steam(){
        machine = true;
    }
    
    public Steam(String name, int prodYear, boolean machine){
        super(name, prodYear);
        this.machine = machine;
    }
    
    public boolean getMachine(){
        return machine;
    }
    
    public void setMachine(boolean machine){
        this.machine = machine;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Machinery: " + (machine ? "Yes" : "No"));
    }
}
