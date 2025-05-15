/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author acer
 */
public class SmartWatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    
    public boolean getTahanAir(){
        return tahanAir;
    }
    
    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        int kapasitasBaterai = super.getKapasitasBaterai();
        int jumlahKamera = super.getJumlahKamera();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + kapasitasBaterai + " | " + jumlahKamera + " | " + ukuranLayar + " | " + tahanAir;
    }
}
