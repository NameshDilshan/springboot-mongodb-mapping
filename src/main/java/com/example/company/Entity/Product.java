package com.example.company.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
 
@Data
@AllArgsConstructor
@Document(collection = "product")
public class Product {

	private String name;
	private int quantity;
	private int price;

}
