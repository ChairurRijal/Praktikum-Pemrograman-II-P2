/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

/**
 *
 * @author ASUS
 */

public class Dadu {
    private int nilai;
    
    public int acakNilai(){
        return nilai = (int) (Math.random()*(6-1+1)+1);
    }

    public int getNilai() {
        return nilai;
    }  
}