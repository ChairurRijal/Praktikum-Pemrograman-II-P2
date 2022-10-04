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

public class PRAK501_2110817210013_MuhammadChairurRijal {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        final float phi = 3.14f;
        Float tinggi, jari, volume;
        
        System.out.print("Masukan Jari-Jari\t: ");
        jari = userInput.nextFloat();
        
        System.out.print("Masukan Tinggi\t\t: ");
        tinggi = userInput.nextFloat();
        
        volume = phi * jari * jari * tinggi;
        
        System.out.println("=======================");
        System.out.println("Volume tabung dengan jari-jari "+jari+"cm dan \n"
                + "tinggi "+tinggi+" cm adalah "+volume+" m3");
    }
}