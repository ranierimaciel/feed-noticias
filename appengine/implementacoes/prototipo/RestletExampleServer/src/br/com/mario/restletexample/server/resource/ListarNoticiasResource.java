package br.com.mario.restletexample.server.resource;

import java.util.List;

import org.restlet.resource.Get;

import br.com.mario.restletexample.server.entity.Noticia;

public interface ListarNoticiasResource {

	@Get
	public List<Noticia> listarNoticias();
}
