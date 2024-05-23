package br.luizfilipe.apigithub.model

data class User(
    val id: String,
    val login: String,
    val bio: String,
    val avatar_url: String
)