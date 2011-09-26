package br.com.mario.restletexample.client.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.appengine.api.datastore.Text;

public class PropertyTextDeserializer extends
		JsonDeserializer<Text> {
	
	ObjectMapper mapper = new ObjectMapper();

	@Override
	public Text deserialize(JsonParser arg0,
			DeserializationContext arg1) throws IOException,
			JsonProcessingException {
		System.out.println("chamando deserializer...");
		ObjectCodec codec = arg0.getCodec();
		JsonNode node = codec.readTree(arg0);
		return mapper.readValue(node, Text.class);
	}

}
