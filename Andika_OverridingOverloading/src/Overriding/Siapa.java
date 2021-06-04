/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Andika Dewa
 */
public class Siapa extends Nama {
    //Method Sapa() pada class Nama di override

    @Override
    public void name() {
        System.out.println("ANDIKA");
    }
}
