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
        AdaptadorDrone ad = new AdaptadorDrone(new PatoReal());
        
        PatoReal pr = new PatoReal();
        
        ad.cuaquear();
        ad.volar();
        
        pr.cuaquear();
        pr.volar();
    }
}
