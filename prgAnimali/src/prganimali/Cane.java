/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prganimali;

/**
 *
 * @author canellis
 */
public class Cane extends Animale  {
    
    private String taglia;
    
    public Cane(String nome, int eta, String taglia) {
        super(nome, eta);
        this.taglia = taglia;
    }
    
     public String getTaglia() {
        return taglia;
    }

    @Override
    public String verso() {
        return "Bau";
    }

    @Override
    public String descrizione() {
        return "Cane: " + getNome() + ", età: " + getEta() + ", taglia: " + taglia + ", verso: " + verso();
    }

    public void abbaiaForte() {
        System.out.println(getNome() + " sta abbaiando forte!");
    }

    
}
