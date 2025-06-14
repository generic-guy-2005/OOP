/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentone;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        boolean runProgram = true;
        Scanner in = new Scanner(System.in);
        
        while(runProgram){
            System.out.println("Menu\n1. Shape\n2. Lingkaran\n3. Persegi Panjang\n4. Persegi\n5. Keluar");
            int opt;
            
            System.out.print("Pilihan: ");
            opt = in.nextInt();
            in.nextLine();
            
            if(opt == 1){
                System.out.print("Warna: ");
                String color;
                color = in.nextLine();
                
                System.out.print("Isi: ");
                boolean filled;
                filled = in.nextBoolean();
                in.nextLine();
                
                Shape obj = new Shape(color, filled);
                System.out.println(obj.toString());
            }
            else if(opt == 2){
                System.out.print("Radius: ");
                double radius;
                radius = in.nextDouble();
                in.nextLine();
                
                System.out.print("Warna: ");
                String color;
                color = in.nextLine();
                
                System.out.print("Isi: ");
                boolean filled;
                filled = in.nextBoolean();
                in.nextLine();
                
                Shape obj = new Circle(radius, color, filled);
                System.out.println(obj.toString());
            }
            else if(opt == 3){
                System.out.print("Lebar: ");
                double width;
                width = in.nextDouble();
                in.nextLine();
                
                System.out.print("Panjang: ");
                double length;
                length = in.nextDouble();
                in.nextLine();
                
                System.out.print("Warna: ");
                String color;
                color = in.nextLine();
                
                System.out.print("Isi: ");
                boolean filled;
                filled = in.nextBoolean();
                in.nextLine();
                
                Shape obj = new Rectangle(width, length, color, filled);
                System.out.println(obj.toString());
            }
            else if(opt == 4){
                System.out.print("Sisi: ");
                double side;
                side = in.nextDouble();
                in.nextLine();
                
                System.out.print("Warna: ");
                String color;
                color = in.nextLine();
                
                System.out.print("Isi: ");
                boolean filled;
                filled = in.nextBoolean();
                in.nextLine();
                
                Shape obj = new Square(side, color, filled);
                System.out.println(obj.toString());
            }
            else if(opt == 5){
                runProgram = false;
            }
        }
    }
}
