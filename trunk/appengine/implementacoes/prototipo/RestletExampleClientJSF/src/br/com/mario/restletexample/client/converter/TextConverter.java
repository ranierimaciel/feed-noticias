package br.com.mario.restletexample.client.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import com.google.appengine.api.datastore.Text;

public class TextConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2 != null && !arg2.equals("")){
			return new Text(arg2);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 != null && !arg2.equals("")){
			return ((Text)arg2).getValue();
		}
		return "";
	}

}
