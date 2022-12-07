package cm.deepdream.employee.deserializers;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cm.deepdream.employee.events.EmployeeRetirementEvent;

public class EmployeeRetirementEventDeserializer implements Deserializer<EmployeeRetirementEvent>{
	private final ObjectMapper objectMapper = new ObjectMapper() ;
	 
	{
		objectMapper.registerModule(new JavaTimeModule());
	}
	
	
	@Override
	public EmployeeRetirementEvent deserialize(String topic, byte[] data) {
		try {
			 return objectMapper.readValue(new String(data, "UTF-8"), EmployeeRetirementEvent.class);
		}catch (Exception ex) {
			throw new SerializationException("Error when deserializing byte[] to EmployeeRetirementEvent");
		}
	}

}
