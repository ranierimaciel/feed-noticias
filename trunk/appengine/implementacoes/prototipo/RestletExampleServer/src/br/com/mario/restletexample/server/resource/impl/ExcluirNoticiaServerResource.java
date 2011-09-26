package br.com.mario.restletexample.server.resource.impl;

import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import br.com.mario.restletexample.server.entity.Noticia;
import br.com.mario.restletexample.server.persistence.PMF;
import br.com.mario.restletexample.server.resource.ExcluirNoticiaResource;

public class ExcluirNoticiaServerResource extends ServerResource implements
		ExcluirNoticiaResource {

	private static final Logger log = Logger
			.getLogger(ExcluirNoticiaServerResource.class.getName());

	@Override
	@Post
	public void excluirNoticia(Long id) {
		log.info("Excluindo notícia: " + id);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			Noticia noticia = pm.getObjectById(Noticia.class, id);
			pm.deletePersistent(noticia);
		} catch(Exception e){
			log.severe("Erro ao excluir notícia: "+e.getMessage());			
		} finally {
			pm.close();
		}
	}

}
