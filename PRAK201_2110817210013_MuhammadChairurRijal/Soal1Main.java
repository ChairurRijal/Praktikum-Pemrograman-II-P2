/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal1;

/**
 *
 * @author ASUS
 */
public class Soal1Main {
    public static void main(String[] args) {
        Buah arumanis = new Buah("arumanis", 0.3f, 13, 3.9f, 65000);
        Buah manalagi = new Buah("manalagi", 0.5f, 17, 8.5f, 127500);
        Buah manggaMadu = new Buah("manggaMadu", 0.375f, 12, 4.5f, 78000);
        
        arumanis.display();
        System.out.println("");
        manalagi.display();
        System.out.println("");
        manggaMadu.display();
    }
}
