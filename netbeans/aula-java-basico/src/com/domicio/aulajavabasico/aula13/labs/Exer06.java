/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domicio.aulajavabasico.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author domiciosilva
 */
public class Exer06 {
    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);      
        
        System.out.println("Entre com o raio do circulo:");
        
        double raio = scan.nextDouble();
        
        double area  = Math.PI * Math.pow (raio, 2);
        
        System.out.println("A area do circulo é "  + area);
        
    }
    
    
    
}
