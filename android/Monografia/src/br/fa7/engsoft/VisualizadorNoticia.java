package br.fa7.engsoft;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class VisualizadorNoticia extends ListActivity{
	
	@Override
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		Intent it = getIntent();
		if (it != null && it.getExtras() != null){
			String msg = it.getExtras() .getString("noticia");
			Log.i("Noticia",msg);
		}
	}
}
