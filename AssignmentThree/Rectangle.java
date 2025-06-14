/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentThree;

/**
 *
 * @author acer
 */
public class Rectangle implements GeometricObject {
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    @Override
    public String toString(){
        return "Width: " + width +
                "\nLength: " + length +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();
    }
    
    @Override
    public double getArea(){
        return width * length;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }
}
