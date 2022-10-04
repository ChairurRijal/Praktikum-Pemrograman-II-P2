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

public class PRAK401_2110817210013_MuhammadChairurRijal {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        int andiA, andiB, andiC, budiA, budiB, budiC;
        int score_andi = 0, score_budi = 0;
        
        
        System.out.print("Kartu Andi: ");
        andiA = userInput.nextInt();
        andiB = userInput.nextInt();
        andiC = userInput.nextInt();
        
                
        System.out.print("Kartu Budi: ");
        budiA = userInput.nextInt();
        budiB = userInput.nextInt();
        budiC = userInput.nextInt();
        
        int [] andi = {andiA, andiB, andiC};
        int [] budi = {budiA, budiB, budiC};
    
        
        for (int i = 0; i < 3; i++){
            if (andi[i] > budi[i]){
                score_andi++;
            } else if (andi[i] < budi[i]){
                score_budi++;
            }
        }
        
        if (score_andi > score_budi){
            System.out.print("ANDI MENANG");
            
        } else if (score_andi < score_budi){
            System.out.print("BUDI MENANG");
        }else 
            System.out.print("HASIL SERI");   
    }
}