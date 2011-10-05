package br.com.mario.restletexample.client.resource;

import java.util.List;

import org.restlet.resource.Get;

import br.com.mario.restletexample.client.entity.Noticia;

public interface ListarNoticiasResource {

	@Get
	public List<Noticia> listarNoticias();
}
