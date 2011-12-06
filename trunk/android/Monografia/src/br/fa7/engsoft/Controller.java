package br.fa7.engsoft;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import br.fa7.engsoft.dto.Categoria;
import br.fa7.engsoft.dto.Empresa;
import br.fa7.engsoft.dto.Noticia;

public class Controller {
	
	public static ArrayList<HashMap<String,String>> getListaNoticias(){
		
		Categoria politica = new Categoria(0,"Politica");
		Categoria economia = new Categoria(0,"Economia");
		Empresa globo = new Empresa(0,"Globo.com", "Globo.com", null);
		Empresa infomoney = new Empresa(0,"InfoMoney", "InfoMoney", null);
		Noticia noticia1 = new Noticia(0,politica,globo, new Date(),"Morte Kaddafi", "Morre o ex ditador........" );
		Noticia noticia2 = new Noticia(0,politica,globo, new Date(),"Alta do Petroleo", "O petroleo sobe novamente........" );
		Noticia noticia3 = new Noticia(0,economia,infomoney, new Date(),"Ibovespa fecha em +2,65%", "Ibovespa fecha em +2,65%....." );
	
		ArrayList<HashMap<String,String>> lista = new ArrayList<HashMap<String,String>>();
		HashMap<String,String> item1 = new HashMap<String,String>();
		HashMap<String,String> item2 = new HashMap<String,String>();
		HashMap<String,String> item3 = new HashMap<String,String>();
		
		item1.put("Categoria",noticia1.getCategoria().getDescricao());
		item1.put("Assunto", noticia1.getAssunto());
		item2.put("Categoria",noticia2.getCategoria().getDescricao());
		item2.put("Assunto",noticia2.getAssunto());
		item3.put("Categoria",noticia3.getCategoria().getDescricao());
		item3.put("Assunto",noticia3.getAssunto());
		
		
		lista.add(item1);
		lista.add(item2);
		lista.add(item3);
		
		return lista;
	
	}

}
