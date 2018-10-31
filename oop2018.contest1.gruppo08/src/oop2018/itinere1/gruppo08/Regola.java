/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo08;
import oop2018.itinere1.gruppo08.azioni.*;
import oop2018.itinere1.gruppo08.condizioni.*;

/**
 *
 * @author liovi
 */
public class Regola{
    private Condizione condizione;
    private Azione azione;

    public Regola(Condizione condizione, Azione azione) {
        this.condizione = condizione;
        this.azione = azione;
    }

    public boolean applica() throws Exception{
        if(condizione.verifica()){
            azione.esegui();
            return true;
        }else
            return false;
    }

    public Condizione getCondizione() {
        return condizione;
    }

    public Azione getAzione() {
        return azione;
    }
    
    @Override
    public String toString() {
        return "Regola{" + '}';
    }
    
    
}
