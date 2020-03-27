package com.github.mkay.mapstuct.kotlin

import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper
abstract class UserMapper {

    abstract fun mapUser(userEntity: UserEntity) : User

    @Mappings(value = [
        Mapping(target = "special", source = "special")
    ])
    abstract fun mapUserWithSpecialAttribute(userEntity: UserEntity, special: String) : User

    @Mappings(value = [
        Mapping(target = "address.street", source = "addressEntity.street"),
        Mapping(target = "address.city", source = "addressEntity.city")
    ])
    abstract fun mapUserWithAddress(userEntity: UserEntity, addressEntity: AddressEntity) : User

    @Mappings(value = [
        Mapping(target = "street", source = "addressEntity.street"),
        Mapping(target = "city", source = "addressEntity.city"),
        Mapping(target = "special", source = "special")
    ])
    abstract fun mapAddressWithSpecial(addressEntity: AddressEntity, special: String) : Address
//
//
//    @Mappings(value = [
//        Mapping(target = "address.street", source = "addressEntity.street"),
//        Mapping(target = "address.city", source = "addressEntity.city"),
//        Mapping(target = "address.special", source = "special"),
//        Mapping(target = "special", source = "special")
//    ])
//    abstract fun mapUserWithAddress(userEntity: UserEntity, addressEntity: AddressEntity, special: String) : User
}
