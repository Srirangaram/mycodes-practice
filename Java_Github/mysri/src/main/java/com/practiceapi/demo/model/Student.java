package com.practiceapi.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {
	
	@Id
//	@GeneratedValue
	@Column(name="ROLL_NUMBER")
	private Long rollNo;
	
	@Column(name="NAME")
	private String studentName;
	
	@Column(name="MOBILE_NUMBER")
	private Long mobileNo;
	
	
		
}
