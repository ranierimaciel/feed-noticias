package br.com.mario.restletexample.server.resource.impl;

import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import br.com.mario.restletexample.server.entity.Noticia;
import br.com.mario.restletexample.server.persistence.PMF;
import br.com.mario.restletexample.server.resource.IncluirNoticiaResource;

public class IncluirNoticiaServerResource extends ServerResource implements
		IncluirNoticiaResource {
	
	private static final Logger log = Logger.getLogger(IncluirNoticiaServerResource.class.getName());	

	@Override
	@Post
	public void incluirNoticia(Noticia noticia) {
		log.info("Incluindo not�cia: "+noticia.getTitulo());
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(noticia);
		} catch (Exception e){
			log.severe("Erro ao incluir not�cia: "+e.getMessage());
		} finally {
			pm.close();
		}
	}

}