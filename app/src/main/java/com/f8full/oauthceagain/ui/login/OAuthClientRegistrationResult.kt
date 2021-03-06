package com.f8full.oauthceagain.ui.login

/**
 * Created by F8Full on 2019-06-10. This file is part of OAuthceAgain
 *
 */
/**
 * Authentication result : success (user details) or error message.
 */
data class OAuthClientRegistrationResult(
    val success: LoggedOAuthClientView? = null,
    val error: Int? = null
)
