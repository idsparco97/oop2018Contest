/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo08.condizioni;

import oop2018.itinere1.gruppo08.dispositivi.*;

/**
 *
 * @author liovi
 */
public class CondizioneMaggioreDi implements Condizione {
    private final Sensore sensore;
    private final double valoreDiConfronto;

    public CondizioneMaggioreDi(Sensore sensore, double valoreDiConfronto) {
        this.sensore = sensore;
        this.valoreDiConfronto = valoreDiConfronto;
    }
    
    @Override
    public boolean verifica(){
        if(sensore.getValore() > this.valoreDiConfronto){
            return true;
        }else        
            return false;
    }
    
    @Override
    public String toString() {
        return "Tipo Condizione: Maggiore di " + valoreDiConfronto + 
                " - attivata per: " + sensore.toString();
    }
    
    
    
}
