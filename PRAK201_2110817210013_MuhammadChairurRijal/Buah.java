/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal1;

/**
 *
 * @author ASUS
 */
public class Buah {
   String namaBuah;
   int jumlahBeli, harga;
   float berat, totalBerat;

    public Buah (String buah, float b, int jb, float tb, int th) { 
        namaBuah = buah;
        berat = b;
        jumlahBeli = jb;
        totalBerat = tb;
        harga = th;
    }
    
    public void display(){
        System.out.println("Nama Mangga :" + namaBuah);
        System.out.println("Berat :" + berat + "kg");
        System.out.println("Jumlah Beli :" + jumlahBeli);
        System.out.println("Total Berat :" + totalBerat + "kg");
        System.out.println("Total Harga :Rp." + harga);
    }
}
