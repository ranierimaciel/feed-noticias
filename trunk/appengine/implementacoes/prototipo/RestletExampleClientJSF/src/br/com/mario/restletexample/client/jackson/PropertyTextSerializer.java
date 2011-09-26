package br.com.mario.restletexample.client.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.google.appengine.api.datastore.Text;

public class PropertyTextSerializer extends JsonSerializer<Text> {

	@Override
	public void serialize(Text arg0, JsonGenerator arg1, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		System.out.println("chamando serializer...");
		arg1.writeStartObject();
		arg1.writeStringField("value", arg0.getValue());
		arg1.writeEndObject();
		//arg1.writeObject(arg0);
	}

}
