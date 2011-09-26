package br.com.mario.restletexample.client.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.restlet.resource.ClientResource;

import br.com.mario.restletexample.client.entity.Noticia;
import br.com.mario.restletexample.client.resource.AtualizarNoticiaResource;
import br.com.mario.restletexample.client.resource.ExcluirNoticiaResource;
import br.com.mario.restletexample.client.resource.IncluirNoticiaResource;
import br.com.mario.restletexample.client.resource.ListarNoticiasResource;
import br.com.mario.restletexample.client.resource.RetornarNoticiaResource;

public class NoticiaService {

	//private static final String URL_SERVIDOR = "http://localhost:8888/";
	private static final String URL_SERVIDOR = "http://mario-restlet-example.appspot.com/";

	private static final String URL_ATUALIZAR_NOTICIA = "atualizarNoticia";
	private static final String URL_EXCLUIR_NOTICIA = "excluirNoticia";
	private static final String URL_INCLUIR_NOTICIA = "incluirNoticia";
	private static final String URL_LISTAR_NOTICIAS = "listarNoticias";
	private static final String URL_RETORNAR_NOTICIA = "retornarNoticia";

	private ClientResource cr = null;
	

	/** Iniciar Resources **/
	private RetornarNoticiaResource getRetornarNoticiaResource() {
		cr = new ClientResource(URL_SERVIDOR + URL_RETORNAR_NOTICIA);
		cr.setRequestEntityBuffering(true);		
		return cr.wrap(RetornarNoticiaResource.class);
	}

	private AtualizarNoticiaResource getAtualizarNoticiaResource() {
		cr = new ClientResource(URL_SERVIDOR + URL_ATUALIZAR_NOTICIA);
		cr.setRequestEntityBuffering(true);
		return cr.wrap(AtualizarNoticiaResource.class);
	}

	private ExcluirNoticiaResource getExcluirNoticiaResource() {
		cr = new ClientResource(URL_SERVIDOR + URL_EXCLUIR_NOTICIA);
		cr.setRequestEntityBuffering(true);
		return cr.wrap(ExcluirNoticiaResource.class);
	}

	private IncluirNoticiaResource getIncluirNoticiaResource() {
		cr = new ClientResource(URL_SERVIDOR + URL_INCLUIR_NOTICIA);
		cr.setRequestEntityBuffering(true);
		return cr.wrap(IncluirNoticiaResource.class);
	}

	private ListarNoticiasResource getListarNoticiasResource() {
		cr = new ClientResource(URL_SERVIDOR + URL_LISTAR_NOTICIAS);
		cr.setRequestEntityBuffering(true);
		return cr.wrap(ListarNoticiasResource.class);
	}

	public Noticia retornarNoticia(Long id) {
		System.out.println("retornando notícia: " + id);
		return getRetornarNoticiaResource().retornarNoticia(id);
	}

	public void atualizarNoticia(Noticia noticia) {
		System.out.println("atualizando notícia: " + noticia.getTitulo());
		getAtualizarNoticiaResource().atualizarNoticia(noticia);
	}

	public void excluirNoticia(Long id) {
		System.out.println("excluindo notícia: " + id);
		getExcluirNoticiaResource().excluirNoticia(id);
	}

	public void incluirNoticia(Noticia noticia) {
		System.out.println("incluindo notícia: " + noticia.getTitulo());
		getIncluirNoticiaResource().incluirNoticia(noticia);
	}

	public List<Noticia> listarNoticias() {
		System.out.println("listando notícias");
		List<Noticia> lista = getListarNoticiasResource().listarNoticias();
		visualizarConteudoLista(lista);
		return lista;
	}
	
	@SuppressWarnings( { "unchecked" })
	private void visualizarConteudoLista(List lista) {
		for (int i = 0; i < lista.size(); i++) {
			LinkedHashMap map = (LinkedHashMap) lista.get(i);
			Set<String> chaves = map.keySet();
			for (String chave : chaves) {
				if (chave != null)
					System.out.print(chave + ": " + map.get(chave) + " | ");
			}
			System.out.println("-");
		}
	}	
}
