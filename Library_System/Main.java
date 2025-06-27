/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_19_06_2025;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Book books[] = new Book[100];
        Author authors[] = new Author[100];
        int idBook, idAuthor;
        idBook = idAuthor = 0;
        
        boolean runProgram;
        runProgram = true;
        
        while(runProgram) {
            System.out.println("MENU\n1. Add Book\n2. Add Author\n3. Search Book\n4. Search Author\n5. Exit");
            int opt;
            System.out.print("Option: ");
            opt = in.nextInt();
            in.nextLine();
            
            if(opt == 1){
                String authorName, email;
                
                System.out.print("Author: ");
                authorName = in.nextLine();
                System.out.print("Email: ");
                email = in.nextLine();
                
                Author writer = new Author(authorName, email);
                authors[idAuthor] = writer;
                idAuthor++;
                
                String bookName, isbn;
                isbn = null;
                double price;
                int qty;
                
                System.out.print("Book Title: ");
                bookName = in.nextLine();
                
                boolean validateIsbn;
                validateIsbn = true;
                
                while(validateIsbn){
                    System.out.print("ISBN: ");
                    isbn = in.nextLine();
                    
                    for(int i = 0; i <= idBook; i++){
                        if(idBook == 0){
                            validateIsbn = false;
                            break;
                        }
                        else if(i == idBook){
                            validateIsbn = false;
                            break;
                        }
                        else if(isbn.equals(books[i].getIsbn())){
                            System.out.println("Duplicate ISBN");
                            break;
                        }
                    }
                }
                System.out.print("Price: ");
                price = in.nextDouble();
                in.nextLine();
                
                System.out.print("Quantity: ");
                qty = in.nextInt();
                in.nextLine();
                
                if(qty == 0){
                    Book published = new Book(isbn, bookName, writer, price);
                    books[idBook] = published;
                }
                else {
                    Book published = new Book(isbn, bookName, writer, price, qty);
                    books[idBook] = published;
                }
                
                idBook++;
                
            }
            else if(opt == 2) {
                String authorName, email;
                
                System.out.print("Author: ");
                authorName = in.nextLine();
                System.out.print("Email: ");
                email = in.nextLine();
                
                Author writer = new Author(authorName, email);
                authors[idAuthor] = writer;
                idAuthor++;
            }
            else if(opt == 3){
                String title;
                System.out.print("Book Title: ");
                title = in.nextLine();
                
                for(int i = 0; i < idBook; i++){
                    if(title.equals(books[i].getName())){
                        System.out.println("Found: " + books[i].toString());
                        break;
                    }
                    else if(i == idBook){
                        System.out.println("Nothing found");
                    }
                }
            }
            else if(opt == 4){
                String author;
                System.out.print("Author Name: ");
                author = in.nextLine();
                
                for(int i = 0; i < idAuthor; i++){
                    if(author.equals(authors[i].getName())){
                        String searched;
                        searched = authors[i].getName();
                        System.out.println("Published Books:");
                        for(int j = 0; j < idBook; j++){
                            if(books[j].getAuthorName().equals(searched)){
                                System.out.println(books[j].getName());
                            }
                        }
                        break;
                    }
                    else if(i == idAuthor){
                        System.out.println("Nothing found");
                    }
                }
            }
            else if(opt == 5){
                runProgram = false;
                System.out.println("Modar");
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
