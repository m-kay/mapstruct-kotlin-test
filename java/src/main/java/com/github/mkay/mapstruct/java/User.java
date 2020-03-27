package com.github.mkay.mapstruct.java;

import lombok.*;

@Value
@Builder
public class User {
	private String firstName;
	private String lastName;
	private Address address;
	private String special;
}
