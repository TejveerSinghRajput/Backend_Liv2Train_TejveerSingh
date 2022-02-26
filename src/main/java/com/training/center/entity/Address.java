package com.training.center.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@Table(name = "Address")
public class Address {

	@Column(name = "DetailedAddress")
	private String Detailedaddress;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@Column(name = "Pincode")
	private String pincode;

}
