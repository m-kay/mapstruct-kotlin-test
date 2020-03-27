package com.github.mkay.mapstruct.java;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class UserMapper {

	abstract User mapUser(UserEnity userEnity);

	@Mapping(target = "special", source = "special")
	abstract User mapUserWithSpecialAttribute(UserEnity userEnity, String special);

	@Mapping(target = "address.street", source = "addressEntity.street")
	@Mapping(target = "address.city", source = "addressEntity.city")
	abstract User mapUserWithAddress(UserEnity userEnity, AddressEntity addressEntity);

	@Mapping(target = "address.street", source = "addressEntity.street")
	@Mapping(target = "address.city", source = "addressEntity.city")
	@Mapping(target = "address.special", source = "special")
	@Mapping(target = "special", source = "special")
	abstract User mapUserWithAddressWithSpecialAttribute(UserEnity userEnity, AddressEntity addressEntity, String special);
}
