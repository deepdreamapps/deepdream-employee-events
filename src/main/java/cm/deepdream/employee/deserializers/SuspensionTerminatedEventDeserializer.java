package cm.deepdream.employee.deserializers;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cm.deepdream.employee.events.SuspensionTerminatedEvent;

public class SuspensionTerminatedEventDeserializer implements Deserializer<SuspensionTerminatedEvent>{
	private final ObjectMapper objectMapper = new ObjectMapper() ;
	 
	{
		objectMapper.registerModule(new JavaTimeModule());
	}
	
	
	
	public SuspensionTerminatedEvent deserialize(String topic, byte[] data) {
		try {
			 return objectMapper.readValue(new String(data, "UTF-8"), SuspensionTerminatedEvent.class);
		}catch (Exception ex) {
			throw new SerializationException("Error when deserializing byte[] to SuspensionTerminatedEvent");
		}
	}

}
