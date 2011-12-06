package br.fa7.engsoft.dto;

public class Empresa {
	private int id;
	private String fantasia;
	private String razao;
	private String cnpj;
	
	
	public Empresa(int id, String fantasia, String razao, String cnpj) {
		
		this.id = id;
		this.fantasia = fantasia;
		this.razao = razao;
		this.cnpj = cnpj;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFantasia() {
		return fantasia;
	}


	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}


	public String getRazao() {
		return razao;
	}


	public void setRazao(String razao) {
		this.razao = razao;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
