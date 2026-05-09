/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeraTacanga;

/**
 *
 * @author sistemas
 */
public class PatoAdaptadorDemo {
    public static void main(String[] args) {
        AdaptadorDrone ad = new AdaptadorDrone(new SuperDrone());
        
        PatoReal pr = new PatoReal();
        
        System.out.println("El drone hace...");
        ad.cuaquear();
        ad.volar();
        
        System.out.println("El pato hace...");
        pr.cuaquear();
        pr.volar();
        
        System.out.println("El adaptardor Drone hace...");  
        ad.cuaquear();
        ad.volar();
        ad.volar();
        ad.volar();
        ad.volar();
        ad.volar();
    }
}
