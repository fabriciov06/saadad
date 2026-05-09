/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeraTacanga;

/**
 *
 * @author sistemas
 */
public class AdaptadorDrone {
    private Drone drone;
    
    AdaptadorDrone(Drone drone){
        this.drone = drone;
    }
    
    public void cuaquear(){
        drone.beep();
    }
    
    public void volar(){
        drone.girarRotor();
    }
}
