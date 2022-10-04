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

public class PRAK301_2110817210013_MuhammadChairurRijal {
     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int bilangan = 1;
        
        do{
            if (user % 7 == 0){
                System.out.print("");
            }
            else System.out.print(user +",");
            bilangan++;
            user--;
        }while (bilangan <=5);
    }      
}