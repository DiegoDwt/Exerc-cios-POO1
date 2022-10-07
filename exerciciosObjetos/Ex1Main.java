package exerciciosObjetos;

import java.util.Scanner;

public class Ex1Main {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Qual o seu nome? ");
	
	String n = entrada.nextLine();
	
	System.out.println("Qual o sobrenome? ");
	
	String s = entrada.nextLine();
	
	Ex1 nomeCompleto = new Ex1();
	nomeCompleto.setNome(n);
	nomeCompleto.setSobrenome(s);
	
	System.out.println("Seu nome completo é " + nomeCompleto.nc());
	
	entrada.close();

	}
}