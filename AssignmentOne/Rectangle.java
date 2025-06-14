/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentone;

/**
 *
 * @author acer
 */
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double length){
       this.width = width;
       this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width * length;
    }
    
    public double getPerimeter(){
        return 2 * (width + length);
    }
    
    @Override
    public String toString(){
        return "Warna: " + super.getColor() +
                "\nIsi" + super.isFilled() +
                "\nLebar: " + this.getWidth() +
                "\nPanjang: " + this.getLength() +
                "\nLuas: " + this.getArea() +
                "\nKeliling: " + this.getPerimeter();
    }
}
