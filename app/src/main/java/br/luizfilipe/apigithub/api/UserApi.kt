package br.luizfilipe.apigithub.api

import br.luizfilipe.apigithub.model.User
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {

    @GET("users")
    suspend fun getAllUsers(): List<User>

    @GET("users/{name}")
    suspend fun findUserByName(@Path("name") name: String): User

}