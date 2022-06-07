package com.wipro.SpringWithMongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document("products")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString

@AllArgsConstructor
@Data
//Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
public class Product {

	private String id;

	private String name;
	private int quantity;
	private String category;

}
