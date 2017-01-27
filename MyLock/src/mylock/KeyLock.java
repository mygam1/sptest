/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylock;

/**
 *
 * @author Owner
 */
public class KeyLock implements Lock{

    @Override
    public void close() {
        System.out.println ("Keylock close method is called ");
    }

    @Override
    public void open() {
        System.out.println ("Keylock open method is called ");
    }
    
}
