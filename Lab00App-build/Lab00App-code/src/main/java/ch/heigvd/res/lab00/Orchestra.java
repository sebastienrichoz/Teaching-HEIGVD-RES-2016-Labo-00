/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.*; // Pour avoir les listess

/**
 *
 * @author Sébastien Richoz
 */
public class Orchestra {
    
    List<IInstrument> instruments = new LinkedList<>();
    
    // Constructeur par défaut invoqué
    
    public int getNumberOfInstruments() {
        return instruments.size();
    }
    
    public void addInstrument(IInstrument instru) {
        instruments.add(instru);
    }
    
    public List<String> makeMusic() {
        List<String> instrumentSounds = new LinkedList<>();
        for(IInstrument u : instruments)
            instrumentSounds.add(u.play());
        return instrumentSounds;
    }
}
