package cm.deepdream.employee.events;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import cm.deepdream.employee.enums.ContractType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContractStartedEvent {
	private Long id ;
	
	private Long employeeId ;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
	private ZonedDateTime eventDate ;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hiringDate ;

	private ContractType contractType ;
	
	private Integer contractDuration ;
	
	private Double weeklyWorkingHours ;
	
	private BigDecimal baseSalary ;
	
	private Long userId ;
	
}
