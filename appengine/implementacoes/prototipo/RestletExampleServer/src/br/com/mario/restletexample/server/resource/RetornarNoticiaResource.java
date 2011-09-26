package br.com.mario.restletexample.server.resource;

import org.restlet.resource.Post;

import br.com.mario.restletexample.server.entity.Noticia;

public interface RetornarNoticiaResource {
	
	@Post
	public Noticia retornarNoticia(Long id);

}
