package com.saran2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private int id;
	private String name;
	private String email;
	private String country;
	
	public User(String name,String email,String country) {
		this.name=name;
		this.email=email;
		this.country=country;
	}

}
