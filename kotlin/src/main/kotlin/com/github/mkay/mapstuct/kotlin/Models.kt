package com.github.mkay.mapstuct.kotlin

import com.github.pozo.KotlinBuilder

data class UserEntity(
        val firstName: String,
        val lastName: String
)

data class AddressEntity(
        val street: String,
        val city: String)

@KotlinBuilder
data class User(
        val firstName: String,
        val lastName: String,
        val address: Address?,
        val special: String?
)

@KotlinBuilder
data class Address(
        val street: String,
        val city: String,
        val special: String?
)
