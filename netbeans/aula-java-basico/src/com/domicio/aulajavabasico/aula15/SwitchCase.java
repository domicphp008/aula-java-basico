/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domicio.aulajavabasico.aula15;

import java.util.Scanner;

/**
 *
 * @author domiciosilva
 */
public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um dia da semana (1-7):");
    
    int diaSemana = scan.nextInt();
    
   if (diaSemana == 1){
       System.out.println("Domingo");      
        }else if (diaSemana == 2){
        System.out.println("Segunda");
        }else if (diaSemana == 3){
        System.out.println("Terça");
        }else if (diaSemana == 4){
        System.out.println("Quarta");
        }else if (diaSemana == 5){
        System.out.println("Quinta");
        }else if (diaSemana == 6){
        System.out.println("Sexta");
        }else if (diaSemana == 7){
        System.out.println("Sábado");
        
    }else{
            System.out.println("Não é uma dia da semana válido");
        }
        
        
    }
    
}
