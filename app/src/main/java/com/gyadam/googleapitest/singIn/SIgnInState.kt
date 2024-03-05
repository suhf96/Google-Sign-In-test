package com.gyadam.googleapitest.singIn

data class SIgnInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null,
)
