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
        AdaptadorPavo ap = new AdaptadorPavo(new PavoSilvestre());
        
        PatoReal pr = new PatoReal();
        
        ap.cuaquear();
        ap.volar();
        
        pr.volar();
        pr.volar();
    }
}
