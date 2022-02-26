package com.training.center.entity;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "CenterInformation", uniqueConstraints = { @UniqueConstraint(columnNames = { "ContactEmail" }) })
public class CenterInformation {

	@Size(max = 40, message = "Maximmum 40 Characters")
	@Column(name = "CenterName")
	private String centerName;

	@Column(name = "CenterCode")
	@Size(min = 12, max = 12, message = "Please enter 12 digit center code")
	private String centerCode;

	@Column(name = "Address")
	private Address address;

	@Column(name = "StudentCapacity")
	private int studentCapacity;

	@ElementCollection
	@Column(name = "CoursesOffered")
	private List<String> coursesOffered;

	@Column(name = "CreatedOn")
	LocalTime createdOn = LocalTime.now();

	@Id
	@Column(name = "contactEmail", unique = true)
	@Email(message = "Please enter valid email")
	private String contactEmail;

	@Column(name = "ContactPhone")
	@Size(min = 12, max = 12, message = "Please enter 12 digit")
	private String contactPhone;

}
