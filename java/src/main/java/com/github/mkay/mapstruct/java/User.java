package com.github.mkay.mapstruct.java;

import lombok.Data;

@Data
public class User {
	private String firstName;
	private String lastName;
	private Address address;
	private String special;
}
