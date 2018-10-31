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
    private Map<, Dispositivo> dispositivi;
    private List<Regola> regole;
    private String nome;

    public Impianto(String nome) {
        this.nome = nome;
    }
    
    public Dispositivo add(Dispositivo d){
        dispositivi.put(, d)
    }
    
    public Dispositivo getDispositivo ( int id){
        return dispositivi.get(id);
    }
    
    public void add(Regola r){
        regole.add(r);
    }
    
    public void applicaRegole() throws Exception{
        for(Regola x: regole){
            x.applica();
        }
    }

    @Override
    public String toString() {
        return "Impianto{" + "dispositivi=" + dispositivi + ", regole=" + regole + ", nome=" + nome + '}';
    }
    
    
}
