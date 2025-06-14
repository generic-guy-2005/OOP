/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwo;

/**
 *
 * @author acer
 */
public class Square extends Rectangle {
    
    public Square(){
        
    }
    
    public Square(double side){
        super.width = side;
        super.length = side;
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return super.width;
    }
    
    public void setSide(double side){
        super.width = side;
        super.length = side;
    }
    
    @Override
    public void setWidth(double side){
        super.width = side;
    }
    
    @Override
    public void setLength(double side){
        super.length = side;
    }
    
    @Override
    public String toString(){
        return "Warna: " + super.getColor() +
                "\nIsi: " + super.isFilled() + 
                "\nSisi: " + super.getWidth() +
                "\nLuas: " + this.getArea() +
                "\nKeliling: " + this.getPerimeter();
    }
}
