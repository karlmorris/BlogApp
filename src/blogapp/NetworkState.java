/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogapp;

import java.util.Observable;

/**
 *
 * @author karlmorris
 */
public class NetworkState extends Observable {
    
    public void networkConnectionEstablished() {
        notifyObservers(new String[] {});
    }
    
}
