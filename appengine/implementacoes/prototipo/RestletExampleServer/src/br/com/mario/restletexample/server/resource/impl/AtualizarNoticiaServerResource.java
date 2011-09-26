package br.com.mario.restletexample.server.resource.impl;

import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import br.com.mario.restletexample.server.entity.Noticia;
import br.com.mario.restletexample.server.persistence.PMF;
import br.com.mario.restletexample.server.resource.AtualizarNoticiaResource;

public class AtualizarNoticiaServerResource extends ServerResource implements
		AtualizarNoticiaResource {

	private static final Logger log = Logger
			.getLogger(AtualizarNoticiaServerResource.class.getName());

	@Override
	@Post
	public void atualizarNoticia(Noticia noticia) {
		log.info("Atualizando notícia: " + noticia.getId());
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(noticia);
		} catch(Exception e){
			log.severe("Erro ao atualizar notícia: "+e.getMessage());
		} finally {
			pm.close();
		}
	}

}
