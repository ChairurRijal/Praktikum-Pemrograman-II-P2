/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class PRAK101_2110817210013_MuhammadChairurRijal {
    public static void main(String[] args) {
        String namaLengkap, tempatLahir, namaBulan=null;
        int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
        float beratBadan;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap :");
        namaLengkap = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat lahir :");
        tempatLahir = keyboard.next();
        
        System.out.print("Masukkan Tanggal Lahir :");
        tanggalLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir :");
        bulanLahir = keyboard.nextInt();
        
        if(bulanLahir==1) namaBulan="Januari";
        else if (bulanLahir==2) namaBulan="Februari";
        else if (bulanLahir==3) namaBulan="Maret";
        else if (bulanLahir==4) namaBulan="April";
        else if (bulanLahir==5) namaBulan="Mei";
        else if (bulanLahir==6) namaBulan="Juni";
        else if (bulanLahir==7) namaBulan="Juli";
        else if (bulanLahir==8) namaBulan="Agustus";
        else if (bulanLahir==9) namaBulan="September";
        else if (bulanLahir==10) namaBulan="Oktober";
        else if (bulanLahir==11) namaBulan="November";
        else if (bulanLahir==12) namaBulan="Desember";
        
        System.out.print("Masukkan Tahun Lahir :");
        tahunLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan :");
        tinggiBadan = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan :");
        beratBadan = keyboard.nextFloat();
        
        System.out.println("Data Telah Ditambahkan!");
        System.out.format("Nama Lengkap %s, Lahir di %s Pada Tanggal %d %s %d\n", namaLengkap, tempatLahir, tanggalLahir, namaBulan, tahunLahir);
        System.out.format("Tinggi Badan %d cm dan Berat Badan %.2f Kilogram", tinggiBadan, beratBadan);  
    } 
}