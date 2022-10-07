package exerciciosObjetos;

public class Cardapio {
	
	private int codItem;
	private double qtdItem;
	
	
	public int getCodItem() {
		return codItem;
	}

	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}

	public double getQtdItem() {
		return qtdItem;
	}

	public void setQtdItem(double qtdItem) {
		this.qtdItem = qtdItem;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("                  **Cardápio**");
		builder.append(System.getProperty("line.separator"));
		builder.append("Especificação    -   Código    -      Preço ");
		builder.append(System.getProperty("line.separator"));
		builder.append("Cachorro quente  -    100      -     R$1,20");
		builder.append(System.getProperty("line.separator"));
		builder.append("Bauru simples    -    101      -     R$1,30");
		builder.append(System.getProperty("line.separator"));	
		builder.append("Bauro com ovo    -    102      -     R$1,50");
		builder.append(System.getProperty("line.separator"));
		builder.append("Hamburguer       -    103      -     R$1,20");
		builder.append(System.getProperty("line.separator"));
		builder.append("Cheeseburguer    -    104      -     R$1,30");
		builder.append(System.getProperty("line.separator"));
		builder.append("Refrigerante     -    105      -     R$1,00");
		builder.append(System.getProperty("line.separator"));
		return builder.toString();
	}
	
	public double calculaPedido(int cod, int qtd) {
		double saida = 0;
		if (cod == 100) {
			saida = qtd * 1.2;
		} else if (cod == 101) {
			saida = qtd * 1.3;
		} else if (cod == 102 ) {
			saida = qtd * 1.5;
		} else if (cod == 103 ) {
			saida = qtd * 1.2;
		} else if (cod == 104 ) {
			saida = qtd * 1.5;
		} else if (cod == 105 ) {
			saida = qtd * 1;
		}
		return saida;		
	}

}
