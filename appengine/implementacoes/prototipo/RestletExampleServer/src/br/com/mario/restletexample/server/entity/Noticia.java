package br.com.mario.restletexample.server.entity;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.loom.appengine.json.TextDeserializer;
import org.loom.appengine.json.TextSerializer;

import com.google.appengine.api.datastore.Text;


@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "true")
public class Noticia implements Serializable {

	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private String titulo;

	@Persistent
	@JsonProperty
	private Text conteudo;

	@Persistent
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

	//@JsonSerialize(using = PropertyTextSerializer.class)
	@JsonSerialize(using = TextSerializer.class)
	public Text getConteudo() {
		return conteudo;
	}

	//@JsonDeserialize(using = PropertyTextDeserializer.class)
	@JsonDeserialize(using = TextDeserializer.class)
	public void setConteudo(Text conteudo) {
		this.conteudo = conteudo;
	}

}