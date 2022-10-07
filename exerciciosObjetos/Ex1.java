package exerciciosObjetos;

public class Ex1 {
	
	private String nome;
	private String sobrenome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() >  0)
			this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		if (sobrenome.length() >  0)
			this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ex1 [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append("]");
		return builder.toString();
	}
	
	public String nc() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(sobrenome);
		return builder.toString();
	}
	
	
	
}
