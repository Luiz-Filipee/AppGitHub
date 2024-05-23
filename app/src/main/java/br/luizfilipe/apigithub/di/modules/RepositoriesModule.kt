package br.luizfilipe.apigithub.di.modules

import br.luizfilipe.apigithub.api.UserApi
import br.luizfilipe.apigithub.repositoris.UserRepository
import br.luizfilipe.apigithub.repositoris.UserRepositoryImp
import org.koin.dsl.module

val repositoriesModule = module {

    single<UserRepository> { providerUserRepository(get()) }

}

private fun providerUserRepository(userApi: UserApi): UserRepositoryImp {
    return UserRepositoryImp(
        userApi = userApi
    )
}