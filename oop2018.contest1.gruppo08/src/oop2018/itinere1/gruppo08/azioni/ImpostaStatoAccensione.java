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
   private boolean SetOn;

    public ImpostaStatoAccensione(Attuatore attuatore, boolean SetOn) {
        this.attuatore = attuatore;
        this.SetOn = SetOn;
    }
   
   public void esegui() throws Exception{
       if(SetOn)
           attuatore.accendi();
       else
           attuatore.spegni();
   }
   
   //DA CONTROLLARE NEL MAIN SE STAMPA LA COSA GIUSTA POICHè TOSTRING.
    @Override
    public String toString(){
        return "Tipo azione: " + super.toString(); 
    }
   
   
   
    
}
