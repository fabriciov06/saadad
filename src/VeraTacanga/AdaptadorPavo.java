/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeraTacanga;

/**
 *
 * @author sistemas
 */
public class AdaptadorPavo implements Pato{
    private Pavo pavo;
    
    AdaptadorPavo(Pavo pavo){
        this.pavo = pavo;
    }
    
    @Override
    public void cuaquear(){
        pavo.gluglutear();
    }
    
    @Override
    public
}
