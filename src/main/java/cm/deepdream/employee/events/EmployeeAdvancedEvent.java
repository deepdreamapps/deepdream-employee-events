package cm.deepdream.employee.events;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeAdvancedEvent {
	private Long id ;
	
	private Long employeeId ;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
	private ZonedDateTime eventDate ;
	
	private LocalDate advancementDate ;
	
	private Long categoryId ;
	
	private Long echelonId ;
	
	private Long userId ;
}
