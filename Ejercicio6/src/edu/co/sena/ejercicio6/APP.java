package edu.co.sena.ejercicio6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duvan
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Alejandra Marin");
        
        Moto motico = new Moto();
        
        motico.setColor("Verde");
        motico.setMarca("Yamaha R3");
        motico.setModelo("2016");
        
        System.out.println("Color: " + motico.getColor());
        System.out.println("Marca: " + motico.getMarca());
        System.out.println("Modelo: " + motico.getModelo());
                
    }
    
}
