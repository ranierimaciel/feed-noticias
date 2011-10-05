package br.com.mario.restletexample.client.entity;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.loom.appengine.json.TextDeserializer;
import org.loom.appengine.json.TextSerializer;

import com.google.appengine.api.datastore.Text;

public class Noticia implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String titulo;
	
	private Text conteudo;

	private Date dataPublicacao;

	public Noticia() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	@JsonSerialize(using = TextSerializer.class)
	public Text getConteudo() {
		return conteudo;
	}

	@JsonDeserialize(using = TextDeserializer.class)
	public void setConteudo(Text conteudo) {
		this.conteudo = conteudo;
	}

}
