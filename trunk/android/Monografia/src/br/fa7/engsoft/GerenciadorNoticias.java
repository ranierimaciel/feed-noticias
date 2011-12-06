package br.fa7.engsoft;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class GerenciadorNoticias extends ListActivity{

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String noticia = this.getListAdapter().getItem(position).toString();
		Intent it = new Intent(this,VisualizadorNoticia.class);
		Bundle params = new Bundle();
		params.putString("noticia", noticia);
		it.putExtras(params);
		startActivity(it);
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ArrayList<HashMap<String,String>> lista = Controller.getListaNoticias();
		String[] chaves = new String[]{"Categoria","Assunto"};
		int[] two = new int[]{android.R.id.text1,android.R.id.text2};
		int layoutNativo = android.R.layout.two_line_list_item;
		setListAdapter(new SimpleAdapter(this,lista, layoutNativo, chaves, two));
	}
	
	

}
