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

public class PRAK201_2110817210013_MuhammadChairurRijal {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        int input = keyboard.nextInt();
        
        while (i <= 6){
            int a;
            if (input % 2 == 0){
                a = (input / 2) -1;
                System.out.print("" + a + "");
            } else {
                System.out.print(input);
            }
            input++;
            i++;
        }
        keyboard.close();
    }
}