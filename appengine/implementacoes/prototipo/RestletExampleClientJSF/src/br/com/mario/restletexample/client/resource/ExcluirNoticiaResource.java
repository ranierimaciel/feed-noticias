package br.com.mario.restletexample.client.resource;

import org.restlet.resource.Post;

public interface ExcluirNoticiaResource {
	
	@Post
	public void excluirNoticia(Long id);
	
}
