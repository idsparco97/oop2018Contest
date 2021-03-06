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
public abstract class Dispositivo {
    private final int id;
    private boolean acceso;

    public Dispositivo(int id) {
        this.id = id;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dispositivo other = (Dispositivo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void accendi(){
        acceso = true;
    }
    public void spegni(){
         acceso = false;
    }
    public boolean isAcceso(){
        if(this.acceso)
            return true;
        else 
            return false;
    }
    
    @Override
    public String toString() {
        if(this.isAcceso())
            return "ID dispositivo: " + id + ", Stato: Acceso";
        else
            return "ID dispositivo: " + id + ", Stato: Spento";
    }
    
    
}
