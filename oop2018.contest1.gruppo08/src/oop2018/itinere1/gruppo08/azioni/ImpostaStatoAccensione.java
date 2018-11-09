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
public class ImpostaStatoAccensione implements Azione{

   private Attuatore attuatore;
   private boolean setOn;

    public ImpostaStatoAccensione(Attuatore attuatore, boolean setOn) {
        this.attuatore = attuatore;
        this.setOn = setOn;
    }
   
   public void esegui(){
       if(setOn)
           attuatore.accendi();
       else
           attuatore.spegni();
   }
   
   //DA CONTROLLARE NEL MAIN SE STAMPA LA COSA GIUSTA POICHè TOSTRING.
    @Override
    public String toString(){
        if (setOn)
            return "Tipo azione: Accendi - attivata per: " + super.toString(); 
        else 
            return "Tipo azione: Spegni - attivata per: " + super.toString();
    }
   
   
   
    
}
