package br.luizfilipe.apigithub.di.modules

import br.luizfilipe.apigithub.repositoris.UserRepository
import br.luizfilipe.apigithub.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { provideUserViewModel(get()) }

}

fun provideUserViewModel(userRepository: UserRepository): UserViewModel{
    return UserViewModel(
        userRepository = userRepository
    )
}