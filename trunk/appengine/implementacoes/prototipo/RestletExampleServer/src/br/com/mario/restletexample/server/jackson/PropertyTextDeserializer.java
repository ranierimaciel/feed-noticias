package br.com.mario.restletexample.server.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import com.google.appengine.api.datastore.Text;

public class PropertyTextDeserializer extends
		JsonDeserializer<Text> {

	@Override
	public Text deserialize(JsonParser arg0,
			DeserializationContext arg1) throws IOException,
			JsonProcessingException {
		System.out.println("chamando deserializer...");	
		return new Text(arg0.getText());
	}

}
