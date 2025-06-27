/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27_03_2025;

/**
 *
 * @author ACER
 */
import java.util.Arrays;
import java.util.Scanner;
public class BankSystem {
    public static void main(String[] args){
        Scanner inside = new Scanner(System.in);
        Bank BRI = new Bank();
        
        System.out.println("==========BANK==========");
        
        while(true){
            System.out.println("----------MENU----------\n1. Tambah Nasabah\n2. Jumlah Nasabah\n3. Lihat Nasabah\n4. Cari Nasabah\n5. Keluar\n");
            int input;
            input = inside.nextInt();
            inside.nextLine();
            
            if(input == 1){
                String firstName, lastName;
                int saldo;
                System.out.print("Nama Depan: ");
                firstName = inside.nextLine();
                
                System.out.print("Nama Belakang: ");
                lastName = inside.nextLine();
                
                System.out.print("Saldo tabungan: ");
                saldo = inside.nextInt();
                inside.nextLine();
                
                if(saldo == 0){
                    BRI.tambahNasabah(firstName, lastName);
                }
                else{
                    Tabungan orang = new Tabungan(saldo);
                    BRI.tambahNasabah(firstName, lastName, orang);
                }
            }
            else if(input == 2){
                System.out.println("Total: " + BRI.getAllNasabah());
            }
            else if(input == 3){
                int order;
                System.out.println("Index: ");
                order = inside.nextInt();
                System.out.println(BRI.getNasabah(order));
            }
            else if(input == 4){
                String firstName, lastName;
                System.out.print("Nama Depan: ");
                firstName = inside.nextLine();
                System.out.print("Nama Belakang: ");
                lastName = inside.nextLine();
                
                if(lastName.isEmpty()){
                    int out[];
                    out = BRI.searchNasabah(firstName);
                    
                    if(out[0] == -1){
                        System.out.println("Nasabah tidak ditemukan");
                    }
                    else{
                        System.out.println("Nasabah dengan ID: " + out[0]);
                    }
                }
                else{
                    int out;
                    out = BRI.searchNasabah(firstName, lastName);
                    
                    if(out == -1){
                        System.out.println("Nasabah tidak ditemukan");
                    }
                    else {
                        System.out.println("Nasabah dengan ID: " + out);
                    }
                    
                }
            }
            else if(input == 5){
                break;
            }
            else{
                System.out.println("Input Error");
            }
        }
        
        System.out.println("----------TABUNGAN----------");
            
        int id;
        System.out.println("Login sebagai (ID): ");
        id = inside.nextInt();

        Nasabah current = BRI.getNasabah(id);
        Tabungan nas = current.getTabungan();
        
        while(true){
            System.out.println("1. Cek Saldo\n2. Setor\n3. Tarik\n4. Transfer\n5. Selesai");
            int input;
            input = inside.nextInt();
            
            if(input == 1){
                System.out.prinln("Total: " + nas.getSaldo());
            }
            else if(input == 2){
                int jumlah;
                System.out.print("Jumlah: ");
                jumlah = inside.nextInt();
                nas.simpanUang(jumlah);
            }
            else if(input == 3){
                int jumlah;
                System.out.print("Jumlah: ");
                jumlah = inside.nextInt();
                nas.ambilUang(jumlah);
            }
            else if(input == 4){
                int jumlah;
                System.out.print("Jumlah: ");
                jumlah = inside.nextInt();
                nas.transfer(nas, jumlah);
            }
            else if(input == 5){
                break;
            }
            else{
                System.out.println("Input Error");
            }
        }
    }
}
