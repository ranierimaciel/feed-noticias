package br.fa7.engsoft.dto;

import java.util.Date;

public class Noticia {

	private int id;
	private Categoria categoria;
	private Empresa empresa;
	private Date data;
	private String descricao;
	private String assunto;
	
	public Noticia(int id, Categoria categoria, Empresa empresa, Date data, String assunto, String descricao) {
		this.id = id;
		this.categoria = categoria;
		this.empresa = empresa;
		this.data = data;
		this.assunto = assunto;
		this.descricao = descricao;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.descricao = assunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getAssunto();
	}
	
}
