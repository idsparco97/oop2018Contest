/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo08;
import oop2018.itinere1.gruppo08.dispositivi.*;

import java.util.*;
/**
 *
 * @author liovi
 */
public class Impianto{
    private final Map<Integer, Dispositivo> dispositivi = new HashMap<>();
    private final List<Regola> regole = new LinkedList<>();
    private final String nome;

    public Impianto(String nome) {
        this.nome = nome;
    }
    
    public Dispositivo add(Dispositivo d){
        return dispositivi.put(d.getId(), d);
    }
    
    public Dispositivo getDispositivo ( int id){
        return dispositivi.get(id);
    }
    
    public void add(Regola r){
        regole.add(r);
    }
    
    public void applicaRegole(){
        for(Regola x: regole){
            x.applica();
        }
    }

    @Override
    public String toString() {
        return "";
    }
    
    
}
