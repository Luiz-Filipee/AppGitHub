package br.luizfilipe.apigithub.repositoris

import br.luizfilipe.apigithub.api.UserApi
import br.luizfilipe.apigithub.model.User

class UserRepositoryImp(
    private val userApi: UserApi
) : UserRepository {

    override suspend fun getAllUser(): List<User> = userApi.getAllUsers()

    override suspend fun findUserByName(name: String): User = userApi.findUserByName(name)

}