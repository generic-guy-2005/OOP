/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author acer
 */
public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming(){
        
    }
    
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }
    
    public int getRefreshRate(){
        return refreshRate;
    }
    
    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
    
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        int ukuranLayar = super.getUkuranLayar();
        int kapasitasRAM = super.getKapasitasRAM();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + ukuranLayar + " | " + kapasitasRAM + " | " + kartuGrafis + " | " + refreshRate;
    }
}
