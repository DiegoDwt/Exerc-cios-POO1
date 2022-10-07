package exerciciosObjetos;

public class BombaCombustivel {

		private String tipoCombustivel;
		private double valorLitro;
		private double quantidadeCombustivel;
		
	
		public BombaCombustivel (String tipoCombustivel, double valorLitro, double quatidadeCombustivel) {
			this.tipoCombustivel = tipoCombustivel;
			this.valorLitro = valorLitro;
			this.quantidadeCombustivel = quatidadeCombustivel;
		}
		
				
		public String getTipoCombustivel() {
			return tipoCombustivel;
		}


		public void setTipoCombustivel(String tipoCombustivel) {
			this.tipoCombustivel = tipoCombustivel;
		}


		public double getValorLitro() {
			return valorLitro;
		}

		public void setValorLitro(double valorLitro) {
			this.valorLitro = valorLitro;
		}

		public double getQuantidadeCombustivel() {
			return quantidadeCombustivel;
		}

		
		public void setQuantidadeCombustivel(double quantidadeCombustivel) {
			this.quantidadeCombustivel = quantidadeCombustivel;
		}


		public double abastecerPorValor(double valor){   //entrada valor - saida qtd litros
			double qtdLitros = 0;
			qtdLitros = valor / valorLitro;
			this.quantidadeCombustivel -= qtdLitros;
			return qtdLitros;
		}
		
		public double abastacerPorLitro(double litros) {  //qtd litros - saida valor a ser pago
			double valor = 0;
			valor = litros * valorLitro;
			this.quantidadeCombustivel -= litros;
			return valor;
		}
		
		public void alteraValor(double valorLitro) {
			this.valorLitro = valorLitro;
		}
		
		public void alteraCombustivel(String tipoCombustivel) {
			this.tipoCombustivel = tipoCombustivel;
		}
		
		public void alteraQuantidadeCombustivel(Double quantidadeCombustivel) {
			this.quantidadeCombustivel = quantidadeCombustivel;
		}
		
			
}
