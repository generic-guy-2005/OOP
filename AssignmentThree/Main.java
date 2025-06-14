/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentThree;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean runProgram = true;
        while(runProgram){
            System.out.println("Menu\n1. Lingkaran\n2. Persegi Panjang\n3. Keluar");
            int opt;
            System.out.print("Pilihan: ");
            opt = in.nextInt();
            in.nextLine();
            
            if(opt == 1){
                System.out.print("Radius: ");
                double radius;
                radius = in.nextDouble();
                in.nextLine();
                
                Circle shape = new Circle(radius);
                System.out.println(shape.toString());
            }
            else if(opt == 2){
                System.out.print("Lebar: ");
                double width, length;
                width = in.nextDouble();
                in.nextLine();
                
                System.out.print("Panjang: ");
                length = in.nextDouble();
                in.nextLine();
                
                Rectangle shape = new Rectangle(width, length);
                System.out.println(shape.toString());
            }
            else if(opt == 3){
                runProgram = false;
            }
            else{
                System.out.println("Error Input");
            }
        }
    }
}
