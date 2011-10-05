package br.com.mario.restletexample.client.mb;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import br.com.mario.restletexample.client.entity.Noticia;
import br.com.mario.restletexample.client.service.NoticiaService;

public class NoticiaMB {
		
	private Noticia noticiaCadastro = new Noticia();
	private List<Noticia> listaNoticias;
	private NoticiaService noticiaService;	
	private Long idNoticia;
	
	private static final String PAG_PRINCIPAL = "principal";
	private static final String PAG_INCLUIR_NOTICIA = "incluir_noticia";
	private static final String PAG_ATUALIZAR_NOTICIA = "atualizar_noticia";
	
	public NoticiaMB(){
		noticiaService = new NoticiaService();
		listaNoticias = noticiaService.listarNoticias();
	}	
	
	private void montarMensagem(String texto, Severity severity){
		FacesMessage message = new FacesMessage();
		message.setDetail(texto);
		message.setSummary(texto);
		message.setSeverity(severity);
		FacesContext.getCurrentInstance().addMessage(null, message);		
	}
	
	public String iniciarPrincipal(){
		listaNoticias = noticiaService.listarNoticias();
		noticiaCadastro = new Noticia();
		return PAG_PRINCIPAL;
	}
	
	public String atualizarNoticias(){
		return iniciarPrincipal();
	}
	
	public String iniciarIncluirNoticia(){
		noticiaCadastro = new Noticia();
		return PAG_INCLUIR_NOTICIA;
	}
	
	public String incluirNoticia(){
		noticiaCadastro.setDataPublicacao(new Date());
		noticiaService.incluirNoticia(noticiaCadastro);
		noticiaCadastro = new Noticia();
		montarMensagem("Notícia incluída com sucesso", FacesMessage.SEVERITY_INFO);
		return iniciarPrincipal();		
	}
	
	public String iniciarAtualizarNoticia(){
		noticiaCadastro = noticiaService.retornarNoticia(idNoticia);
		return PAG_ATUALIZAR_NOTICIA;
	}
	
	public String atualizarNoticia(){
		noticiaCadastro.setDataPublicacao(new Date());		
		noticiaService.atualizarNoticia(noticiaCadastro);
		noticiaCadastro = new Noticia();
		montarMensagem("Notícia atualizada com sucesso", FacesMessage.SEVERITY_INFO);
		return iniciarPrincipal();		
	}	
	
	public String retornarNoticia(){		
		noticiaService.retornarNoticia(noticiaCadastro.getId());
		return "";
	}
	
	public String excluirNoticia(){
		noticiaService.excluirNoticia(idNoticia);
		montarMensagem("Notícia excluída com sucesso", FacesMessage.SEVERITY_INFO);
		return iniciarPrincipal();
	}

	public Noticia getNoticiaCadastro() {
		return noticiaCadastro;
	}

	public void setNoticiaCadastro(Noticia noticiaCadastro) {
		this.noticiaCadastro = noticiaCadastro;
	}

	public List<Noticia> getListaNoticias() {
		return listaNoticias;
	}

	public void setListaNoticias(List<Noticia> listaNoticias) {
		this.listaNoticias = listaNoticias;
	}

	public Long getIdNoticia() {
		return idNoticia;
	}

	public void setIdNoticia(Long idNoticia) {
		this.idNoticia = idNoticia;
	}
	
}
