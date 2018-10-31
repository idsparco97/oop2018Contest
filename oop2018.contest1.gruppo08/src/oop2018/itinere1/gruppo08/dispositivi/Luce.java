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
public abstract class Luce extends Attuatore{
    
    public Luce(int id) {
        super(id);
    }

    
    //DA DEFINIRE
    @Override
    public String toString() {
        return super.toString()+ " - Tipo: Luce";
    }
    
    
    
}
