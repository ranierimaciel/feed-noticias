package br.com.mario.restletexample.client.resource;

import org.restlet.resource.Post;

import br.com.mario.restletexample.client.entity.Noticia;

public interface AtualizarNoticiaResource {
	
	@Post
	public void atualizarNoticia(Noticia noticia);
	
}
