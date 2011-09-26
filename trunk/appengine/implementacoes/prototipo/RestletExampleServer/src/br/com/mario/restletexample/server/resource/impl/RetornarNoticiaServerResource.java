package br.com.mario.restletexample.server.resource.impl;

import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import br.com.mario.restletexample.server.entity.Noticia;
import br.com.mario.restletexample.server.persistence.PMF;
import br.com.mario.restletexample.server.resource.RetornarNoticiaResource;

public class RetornarNoticiaServerResource extends ServerResource implements
		RetornarNoticiaResource {

	private static final Logger log = Logger
			.getLogger(RetornarNoticiaServerResource.class.getName());

	@Override
	@Post
	public Noticia retornarNoticia(Long id) {
		log.info("Retornando notícia: " + id);
		Noticia noticia = null;
		PersistenceManager pm = PMF.get().getPersistenceManager();
		pm.setDetachAllOnCommit(true);
		try {
			noticia = pm.getObjectById(Noticia.class, id);
		} catch(Exception e){
			log.severe("Erro ao retornar notícia: "+e.getMessage());			
		} finally {
			pm.close();
		}
		return noticia;
	}

}