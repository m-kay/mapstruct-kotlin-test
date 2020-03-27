package com.github.mkay.mapstruct.java;

import lombok.*;

@Value
@Builder
public class Address {
	private String street;
	private String city;
	private String special;
}
