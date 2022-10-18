/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal3;

/**
 *
 * @author ASUS
 */
public class Pegawai {
     public String nama;
    //Error di bagian ini karena tipe data yang tidak sesuai dengan nilai yang ingin dimasukkan, diubah dari char ke String
    //public char asal;
    public String asal; 
    
    //membuat variabel baru bernama j
    //public String jabatan;  
    public String jabatan, j;  
    
    //Bukan error, tetapi angka 17 dimasukkan sebagai nilai dari variabel umur agar output sesuai dengan perintah
    public int umur = 17; 
    
    public String getNama() {
        return nama;
    }
    
    public String getAsal() {
        return asal; 
    }
    
    public void setJabatan() {
        //di baris ini terdapat error karena variabel j belum ada dibuat
        this.jabatan = j;  
    }
    
    public void setJabatan(String a){
        this.jabatan = a;
    }
}