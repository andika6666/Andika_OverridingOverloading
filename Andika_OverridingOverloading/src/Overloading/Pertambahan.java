/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author Andika Dewa
 */
public class Pertambahan {

    //Method tambah pertama
    public void tambah() {
        int a = 5, b = 10;
        System.out.println("Hasil Jumlah a dan b : " + (a + b));
    }
    
    //Method tambah kedua
    public void tambah(int x, int y) {
        System.out.println("Hasil Jumlah x dan y : " + (x + y));
    }
}
