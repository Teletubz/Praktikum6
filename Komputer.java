/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiclass;

/**
 *
 * @author hp
 */
public class Komputer {
    public String merk;
    
    //Dependensi//
    
    public void on(CPU cpu){
        cpu.on();
    }
    
    public void off(CPU cpu){
        cpu.off();
    }
    
    public void run() {
        System.out.println("Komputer menyala......");
    }
    
    //===============================================
    
    //Agregasi
    
    //public Mouse mouse;
    
    //public Komputer(Mouse m) {
    //    mouse = m;
    //}
       
    //public void click(){
    //    mouse.click();
    //}
    
    //Asosiasi
    
    //public Keyboard keyboard;
    
    //public void ketik() {
    //    keyboard.ketik();
    //}
        
 }
