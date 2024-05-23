package br.luizfilipe.apigithub.repositoris

import br.luizfilipe.apigithub.model.User

interface UserRepository {

    suspend fun getAllUser(): List<User>

    suspend fun findUserByName(name: String): User
}