/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_15_5_2025;

/**
 *
 * @author acer
 */
public class Truk extends Mobil {
    protected int muatanMaks;
    
    public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks){
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }
    
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks = muatanMaks;
    }
    
    public int getMuatanMaks(){
        return muatanMaks;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + super.bahanBakar + " | " + super.kapasitasMesin + muatanMaks;
    }
}
