/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27_03_2025;

/**
 *
 * @author ACER
 */
public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;
    
    public Bank() {
        nasabah = new Nasabah[100];
        jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String firstName, String lastName){
        nasabah[jumlahNasabah++] = new Nasabah(firstName, lastName);
    }
    
    public void tambahNasabah(String firstName, String lastName, Tabungan tabungan){
        Nasabah n = new Nasabah(firstName, lastName);
        n.setTabungan(tabungan);
        nasabah[jumlahNasabah++] = n;
    }
    
    public int getAllNasabah(){
        return jumlahNasabah;
    }
    
    public Nasabah getNasabah(int index){
        return (index >= 0 && index < jumlahNasabah) ? nasabah[index] : null;
    }
    
    public int searchNasabah(String firstName, String lastName){
        for(int i = 0; i < jumlahNasabah; i++){
            if(nasabah[i].toString().contains(firstName + " " + lastName)){
                return i;
            }
        }
        return -1;
    }
    
    public int[] searchNasabah(String firstName) {
        int[] hasil = new int[jumlahNasabah];
        int count = 0;
        for(int i = 0; i < jumlahNasabah; i++){
            if(nasabah[i].toString().contains(firstName)){
                hasil[count++] = i;
            }
        }
        return java.util.Arrays.copyOf(hasil, count);
    }
}
