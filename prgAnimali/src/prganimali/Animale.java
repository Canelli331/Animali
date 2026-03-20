/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prganimali;

/**
 *
 * @author canellis
 */
public abstract class Animale {

    private String nome;
    private int eta;

    // Costruttore con parametri
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Metodi getter
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    // Metodo astratto verso()
    public abstract String verso();

    // Metodo astratto descrizione()
    public abstract String descrizione();

    // Metodo concreto toString()
    @Override
    public String toString() {
        return descrizione();
    }
    
}
