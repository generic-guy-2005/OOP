/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwo;

/**
 *
 * @author acer
 */
public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    
    public Rectangle(){
        
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
    
    @Override
    public double getArea(){
        return width * length;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }
    
    @Override
    public String toString(){
        return "Warna: " + super.getColor() +
                "\nIsi: " + super.isFilled() + 
                "\nLebar: " + width +
                "\nPanjang: " + length +
                "\nLuas: " + this.getArea() +
                "\nKeliling: " + this.getPerimeter();
    }
}
