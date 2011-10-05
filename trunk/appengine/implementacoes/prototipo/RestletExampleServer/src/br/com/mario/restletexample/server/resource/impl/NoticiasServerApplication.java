package br.com.mario.restletexample.server.resource.impl;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

public class NoticiasServerApplication extends Application {

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.attachDefault(new Directory(getContext(), "war:///"));
		router.attach("/atualizarNoticia", AtualizarNoticiaServerResource.class);
		router.attach("/excluirNoticia", ExcluirNoticiaServerResource.class);
		router.attach("/incluirNoticia", IncluirNoticiaServerResource.class);
		router.attach("/listarNoticias", ListarNoticiasServerResource.class);
		router.attach("/retornarNoticia", RetornarNoticiaServerResource.class);
		return router;
	}
}
