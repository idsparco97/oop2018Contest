/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo08.dispositivi;

/**
 *
 * @author liovi
 */
public class Condizionatore extends AttuatoreRegolabile{
    
    public Condizionatore(int id, double livelloMin, double livelloMax, double livello) throws LivelloNonValidoException {
        super(id, livelloMin, livelloMax, livello);
    }
 
    @Override
    public String toString() {
        return super.toString()+" - Tipo: Condizionatore";
    }
    
    
}
