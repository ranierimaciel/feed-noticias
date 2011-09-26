package br.com.mario.restletexample.server.resource;

import org.restlet.resource.Post;


public interface ExcluirNoticiaResource {
	
	@Post
	public void excluirNoticia(Long id);
	
}
