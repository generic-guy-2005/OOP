/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_15_5_2025;

/**
 *
 * @author acer
 */
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKM;
    
    public Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKM){
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKM = tarifPerKM;
    }
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKM(int tarifPerKM){
        this.tarifPerKM = tarifPerKM;
    }
    
    public int getTarifPerKM(){
        return tarifPerKM;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + super.bahanBakar + " | " + super.kapasitasMesin + " | " + tarifAwal + " | " + tarifPerKM;
    }
}
