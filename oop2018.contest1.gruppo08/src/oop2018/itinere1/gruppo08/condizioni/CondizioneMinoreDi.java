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
public class CondizioneMinoreDi implements Condizione{
    private Sensore sensore;
    private double valoreDiConfronto;

    public CondizioneMinoreDi(Sensore sensore, double valoreDiConfronto) {
        this.sensore = sensore;
        this.valoreDiConfronto = valoreDiConfronto;
    }
    
    @Override
    public boolean verifica(){
         if(sensore.getValore() < valoreDiConfronto){
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Tipo Condizione: Minore di" + valoreDiConfronto + 
                " - attivata per: ID dispositivo: " + id + ", Stato: " + stato + " Categoria: " + sensore + " Lettura: " + lettura
                + " - Tipo: " + tipo;
    }
    
}
