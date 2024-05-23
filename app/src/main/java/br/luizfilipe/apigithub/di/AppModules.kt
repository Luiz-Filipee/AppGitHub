package br.luizfilipe.apigithub.di

import br.luizfilipe.apigithub.di.modules.apiModule
import br.luizfilipe.apigithub.di.modules.repositoriesModule
import br.luizfilipe.apigithub.di.modules.viewModelsModule

val appModules = listOf(
    apiModule,
    repositoriesModule,
    viewModelsModule

)