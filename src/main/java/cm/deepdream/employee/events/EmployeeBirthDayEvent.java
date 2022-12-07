package cm.deepdream.employee.events;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import cm.deepdream.employee.enums.Periodicity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeBirthDayEvent {
	private Long subscriberId ;
	
	private List<Long> employeeIds ;
	
	private Periodicity periodicity ;
	
	private Month month ;
	
	private LocalDate date ;
	
	private LocalDate weekStart ;
	
	private LocalDate weekEnd ;
}
