/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prganimali;

import java.util.ArrayList;

/**
 *
 * @author canellis
 */
public class GestioneNegozio {

    ArrayList<Animale> animali= new ArrayList();

    public GestioneNegozio() {
        animali=new ArrayList();
    }
    
    public void aggiungiAnimale(Animale a){
        animali.add(a);
    }
    
    public boolean rimuoviAnimale(String nome){
        for (Animale a : animali) {
            if (a.getNome().equals(nome)) {
                animali.remove(a);
                return true;
            }          
        }
        return false;
    }
    
    public Animale cercaPerNome(String nome) {
        for (Animale a : animali) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }
    
    public void stampaAnimali(){
        for(Animale a: animali){
            System.out.println(a);
        }
    }
    
    public int contaAnimale(){
        return animali.size();
    }
    
}
