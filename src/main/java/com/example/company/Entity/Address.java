package com.example.company.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "address")
public class Address {

	private String city;
	private String state;
	private String code;

}
