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
public class Main {

    public static void main(String[] args) {
        Pertambahan jumlah = new Pertambahan();
        jumlah.tambah();
        //Parameter x dan y
        jumlah.tambah(2, 2);
    }
}
