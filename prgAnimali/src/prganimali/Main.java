/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prganimali;

/**
 *
 * @author canellis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gatto gatto=new Gatto("gatto1", 10, "persiano ");
        Cane cane = new Cane("pongo", 4, "Grande");
        Pesce pesce = new Pesce("esposti", 1, "Salata");
        Pappagallo pappagallo = new Pappagallo("pippo", 3, true);
        
        gatto.faiLeFusa();
        cane.abbaiaForte();
        pesce.nuota();
        pappagallo.ripeti("Esposti e il miglior compagneros dewl mondo");
        
        Animale[] animali= {gatto, cane, pesce, pappagallo};
        
        for (Animale a : animali) {
            System.out.println(a.verso());
            System.out.println(a.descrizione());
        }
        
    }
    
}
