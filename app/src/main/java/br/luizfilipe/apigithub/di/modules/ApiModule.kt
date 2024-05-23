package br.luizfilipe.apigithub.di.modules

import br.luizfilipe.apigithub.api.UserApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {

    single { providerUserApi() }

}

private fun providerUserApi(): UserApi {
    return Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(UserApi::class.java)
}