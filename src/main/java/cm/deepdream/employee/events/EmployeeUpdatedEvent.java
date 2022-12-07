package cm.deepdream.employee.events;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import cm.deepdream.employee.enums.Gender;
import cm.deepdream.employee.enums.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeUpdatedEvent {
	private Long id ;
	
	private Long employeeId ;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
	private ZonedDateTime eventDate ;
	
	private String registrationNumber ;
	
	private String firstName ;
	
	private String lastName ;
	
	private Gender gender ;

	private MaritalStatus maritalStatus ;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate ;
	
	private String socialSecurityNumber ;
	
	private Integer retirementAge ;
	
	private String phoneNumber ;
	
	private String emailAddress ;
	
	private String address ;
	
	private Long positionId ;

	private Long unitId ;
	
	private Long functionId ;

	private Long categoryId ;

	private Long echelonId ;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hiringDate ;

	private String contractType ;
	
	private Integer contractDuration ;
	
	private Double weeklyWorkingHours ;
	
	private BigDecimal baseSalary ;

	private Integer children ;

	private Long bankId ;

	private Long bankAgencyId ;

	private String bankAccount ;

	private String bankAccountKey ;

	private Long operatorId ;

	private String momoNumber ;
	
	private Long userId ;
	
}
