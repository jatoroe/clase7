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
public class pizza {
    private String Toppings;
    private int inches;
    private double price;
    
public void setTam(int t){
 this.inches = t;   
    }
public void setPrice (double p){
    this.price = p ;    
}
public void setIng (String i){
   this.Toppings = i;
}
public int getTam(){
    return this.inches;
}
public String getIng (){
    return this.Toppings;
}
public double getPrice(){
    return this.price;
}
}
