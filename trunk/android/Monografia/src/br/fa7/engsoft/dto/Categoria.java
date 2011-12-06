package br.fa7.engsoft.dto;

public class Categoria {

	private int id;
	private String descricao;


	public Categoria(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
