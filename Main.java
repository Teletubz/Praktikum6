/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiclass;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        
    
    //Dependensi//
    
    CPU cpu = new CPU();
    

    Komputer intel = new Komputer();
    
    intel.merk = "Core i3";
    intel.on(cpu);
    intel.run();
    intel.off(cpu);
    
    //=============================
    
    //Agregasi//
    
    //Mouse mouse = new Mouse();
    
    //mouse.merk = "Razer";
    
    //Komputer razer = new Komputer(mouse);
   
    //razer.click();
    
    //===============================
    
    //Asosiasi
    
    //Keyboard keyboard = new Keyboard();
    
    //keyboard.merk = "Logitech";
    
    //Komputer logitech = new Komputer();

    //logitech.keyboard = keyboard;
    //logitech.ketik();
    
    }
}
