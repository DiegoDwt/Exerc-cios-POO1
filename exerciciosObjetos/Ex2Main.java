package exerciciosObjetos;

import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		String verificacao;
		
		Ex2 intervalo = new Ex2();
		intervalo.setNum1(n1);
		intervalo.setNum2(n2);
		
			System.out.println("Digite um número inteiro: ");
			n1 = entrada.nextInt();
			System.out.println("Digite outro numero inteiro: ");
			n2 = entrada.nextInt();
			verificacao = intervalo.verificaOrdem(n1, n2);
			if (!verificacao.equals("")) {
				System.out.println(verificacao);
			}
			
			
			System.out.println(intervalo.vetorIntervalo(n1, n2));
					
			
			entrada.close();
	}

}
