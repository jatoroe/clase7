/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Estudiante
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("My pizza");
        pizza Pizza = new pizza();
        Pizza.setIng("Mexicana");
        Pizza.setTam(12);
        Pizza.setPrice(13.99);
        System.out.println(Pizza.getIng());
        System.out.println(Pizza.getTam());
        System.out.println(Pizza.getPrice());
        System.out.println("Pizza programa");
        pizza PizzaProg = new pizza();
        PizzaProg.setIng("Pepeponi");
        PizzaProg.setTam(6);
        PizzaProg.setPrice(8.99);
        System.out.println(PizzaProg.getIng());
        System.out.println(PizzaProg.getTam());
        System.out.println(PizzaProg.getPrice());
    
    }
    
}
