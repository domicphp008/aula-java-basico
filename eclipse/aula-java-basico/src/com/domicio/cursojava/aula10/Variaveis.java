package com.domicio.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 20;
		String nome = "Domicio";
		String NomeDoMeuCachorro = " Mini"; 
		String ano2014 = "2014";
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
	
		
		//não conveção Java
		String nome_do_meu_cachorro;
	
		String nomeDoMeucachorro;
		
		idade = 25;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má prática
		int a = 10;
		String b = "Loiane";
	}

}
