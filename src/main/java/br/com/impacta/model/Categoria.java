package br.com.impacta.model;

public enum Categoria {
	ALIMENTACAO("Alimentação"),
	TRANSPORTE("Transporte"),
	VESTUÁRIO("Vestuário"),
	CUIDADOS_PESSOAIS("Cuidados pessoais"),
	MORADIA("Moradia"),
	LAZER("Lazer"),
	EDUCAÇÃO("Educação"),
	COMPRAS("Compras"),
	DIVERSOS("Diversos");
	
	private String nome;

	private Categoria(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}
