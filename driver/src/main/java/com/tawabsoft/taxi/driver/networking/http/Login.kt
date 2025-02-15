package com.tawabsoft.taxi.driver.networking.http

import com.tawabsoft.taxi.common.models.Driver
import com.tawabsoft.taxi.common.networking.http.interfaces.HTTPRequest
import com.squareup.moshi.JsonClass

class Login(fireBaseToken: String): HTTPRequest() {
    override val path: String = "driver/login"
    init {
        this.params = mapOf("token" to fireBaseToken)
    }
}

@JsonClass(generateAdapter = true)
data class LoginResult(
    val token: String,
    val user: Driver
)