/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo08.azioni;
import oop2018.itinere1.gruppo08.dispositivi.*;

/**
 *
 * @author liovi
 */
public class ImpostaLivello implements Azione{
    private AttuatoreRegolabile ar;
    private double livelloDaImpostare;

    public ImpostaLivello(AttuatoreRegolabile ar, double livelloDaImpostare) {
        this.ar = ar;
        this.livelloDaImpostare = livelloDaImpostare;
    }

    @Override
    public void esegui() throws LivelloNonValidoException {
        if((ar.getLivelloMin() < ar.getLivello()) && (ar.getLivello()<ar.getLivelloMax())){
            livelloDaImpostare=ar.getLivello();
        }
        else 
            throw new LivelloNonValidoException();
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
}
