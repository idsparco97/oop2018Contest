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
public abstract class AttuatoreRegolabile extends Attuatore{
    
    private final double livelloMin;
    private final double livelloMax;
    private double livello;

    public AttuatoreRegolabile(int id, double livelloMin, double livelloMax, double livello) throws LivelloNonValidoException{
        super(id);
        this.livelloMin = livelloMin;
        this.livelloMax = livelloMax;
        if(this.livelloMin<=this.livello && this.livello<=this.livelloMax)
           this.livello = livello;
        else 
           throw new LivelloNonValidoException();
    }

    public double getLivelloMin() {
        return livelloMin;
    }

    public double getLivelloMax() {
        return livelloMax;
    }

    public double getLivello() {
        return livello;
    }

    public void setLivello(double livello) throws LivelloNonValidoException {
        if(this.livelloMin<=this.livello && this.livello<=this.livelloMax)
           this.livello = livello;
        else 
           throw new LivelloNonValidoException();
    }

    
    
    @Override
    public String toString() {
        return super.toString()+" Attuatore regolabile Liv/Min/Max = "+ livello +"/"+  livelloMin +"/" + livelloMax ;
    }
    
    
    
}
