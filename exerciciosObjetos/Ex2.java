package exerciciosObjetos;


public class Ex2 {
	
	private int num1;
	private int num2;
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	public String verificaOrdem(int n1, int n2) {
		String saida = "";
		if (n2 < n1) {
			saida = "O primeiro número deve ser menor, a ordem será invertida!";
		}
		return saida.toString();
	}

	public String vetorIntervalo(int n1, int n2) {
		int aux = 0;
		if (n1 > n2) {
			aux = n2;
			n2 = n1;
			n1 = aux;
		}
		int tamanho = n2 - n1;
		int[] array = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			if (i == 0) {
				array[i] = n1;
			} else {
				array[i] = array[i - 1] + 1;
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < tamanho; i++) {
			builder.append(array[i] + " | ");	
			if (i % 20 == 0) {
				builder.append(System.getProperty("line.separator"));
			}
		}
		return builder.toString();
	}

}
