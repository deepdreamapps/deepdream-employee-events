package cm.deepdream.employee.serializers;
import org.apache.kafka.common.errors.SerializationException;
import  org.apache.kafka.common.serialization.Serializer ;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cm.deepdream.employee.events.ContractTerminatedEvent;

public class ContractTerminatedEventSerializer implements Serializer<ContractTerminatedEvent>{
	private final ObjectMapper objectMapper = new ObjectMapper() ;
	 
	{
	   objectMapper.registerModule(new JavaTimeModule());
	}
	
	
	@Override
	public byte[] serialize(String topic, ContractTerminatedEvent event) {
		try {
			return objectMapper.writeValueAsBytes(event) ;
		} catch (Exception e) {
            throw new SerializationException("Error when serializing ContractTerminatedEvent to byte[]") ;
        }
	}

}
