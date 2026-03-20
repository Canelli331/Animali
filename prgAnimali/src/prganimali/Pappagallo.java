/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prganimali;

/**
 *
 * @author canellis
 */
public class Pappagallo extends Animale {
    
    private boolean parla;

    public Pappagallo(String nome, int eta,boolean parla) {
        super(nome, eta);
        this.parla = parla;
    }
    
    public boolean isParla(){
        return parla;
    }
    
    @Override
    public String verso() {
        if (parla==true) return "Espo ti amo";
        else return "espo non posso parlare";
    }

   
    
    public void ripeti(String frase){
        if (parla==true) System.out.println(getNome()+" ripete: " + frase );
        else System.out.println(getNome() + " non sa parlare");
    }

    @Override
    public String descrizione() {
        return "Pappagallo" + getNome() + ", età: " + getEta() + ", parla: " + isParla() + ", verso: " + verso(); 
    }

    
    
    
}
