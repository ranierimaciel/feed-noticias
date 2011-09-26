package br.com.mario.restletexample.server.resource.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import br.com.mario.restletexample.server.entity.Noticia;
import br.com.mario.restletexample.server.persistence.PMF;
import br.com.mario.restletexample.server.resource.ListarNoticiasResource;

public class ListarNoticiasServerResource extends ServerResource implements
		ListarNoticiasResource {
	
	private static final Logger log = Logger.getLogger(IncluirNoticiaServerResource.class.getName());

	@SuppressWarnings("unchecked")
	@Override
	@Get
	public List<Noticia> listarNoticias() {
		log.info("Listando todas as notícias"); 
		List<Noticia> lista = null;
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			String query = "select from " + Noticia.class.getName();
			lista = (List<Noticia>) pm.newQuery(query).execute();
		} catch (Exception e){
			log.severe("Erro ao listar notícias: "+e.getMessage());
		} finally {
			//pm.close();
		}
		return lista;
	}
	

}
