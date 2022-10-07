package exerciciosObjetos;

public class Pessoa {
	
	private String nome;
	private int idade;
	private float peso;
	private double altura;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public void envelhecer(int incremento) {  
		double aux = 0;
		if (idade < 21) {
			aux = 21 - idade;
			for (int i = 0; i < aux; i++) {
				this.altura = altura + 0.5;
			}
	    }
		this.idade = idade + incremento;
	}
	
	
	public void engordar(float incremento) {
		this.peso = peso + incremento;
	}
	
	
	public void emagrecer(float decremento) {
		this.peso = peso - decremento;
	}
	
	
	public void crescer(double incremento) {
		this.altura = altura + incremento;
	}
	
	
}
