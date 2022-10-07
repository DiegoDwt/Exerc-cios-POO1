package exerciciosObjetos;

import java.util.Scanner;

public class Ex10Main {

	public static void main(String[] args) {
		
		int opcao = 0;
		boolean sair = false;
		int canal = 0;
		String saida = "";
		
		Scanner entrada = new Scanner(System.in);
		
		Televisor tv = new Televisor (10, 10);
		
		do {
			System.out.println("Digite a op��o: ");
			System.out.println("1 - Trocar de canal");
			System.out.println("2 - Aumentar o volume");
			System.out.println("3 - Diminuir o volume");
			System.out.println("4 - Sair");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print("Informe o n�mero do canal: ");
				canal = entrada.nextInt();
				saida = tv.mudaCanal(canal);
				if (saida.equals("")) {
					System.out.println("Canal: " + tv.getCanal());
				} else {
					System.out.println(tv.mudaCanal(canal));
				}	
				break;
			case 2:
				System.out.println(tv.maisVolume());
				System.out.println("Volume: " + tv.getVolume());
				break;
			case 3:
				System.out.println(tv.menosVolume());
				System.out.println("Volume: " + tv.getVolume());
				break;
			case 4:
				sair = true;
				System.out.println("At� logo!");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}			
		} while(!sair);

		entrada.close();

	}

}
