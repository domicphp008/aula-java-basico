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
public class Exer13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o valor/hora");    
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com a quantidade de %s é %.2f horas trabalhadas no mes");
        double horas = scan.nextDouble();
        System.out.println("");
        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("INSS " +  inss);
        System.out.println(" Sindicato: " + sindicato);
        System.out.println(" IR  " +  ir);
        System.out.println(" Total descontos: " + totalDescontos);
        System.out.println(" Salario Liquido: " + salarioLiquido);
        
                                    
    }
}

    

