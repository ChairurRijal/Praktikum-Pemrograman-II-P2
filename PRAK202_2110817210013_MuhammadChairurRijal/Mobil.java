/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal2;

/**
 *
 * @author ASUS
 */
public class Mobil {
   String merek;
   int harga;
   String tahun_keluaran;
   int kapasitas;
   String pemilik;
   int pajak;

    public void info(){
       System.out.println("Merek Mobil:" + merek);
       System.out.println("Harga :Rp." + harga);
       System.out.println("Tahun Keluaran :" + tahun_keluaran);
       System.out.println("Kapasitas : " + kapasitas + "CC");
    }
    
    public void setPemilik(String Owner){
        pemilik = Owner;
    }
    
    public String getPemilik(){
        return pemilik;
    
    }
    public int getPajak(){
        pajak = harga*2/100;
        return pajak;
    }

}