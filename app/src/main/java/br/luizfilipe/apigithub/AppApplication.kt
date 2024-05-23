package br.luizfilipe.apigithub

import android.app.Application
import br.luizfilipe.apigithub.di.appModules
import br.luizfilipe.apigithub.di.modules.apiModule
import br.luizfilipe.apigithub.di.modules.repositoriesModule
import br.luizfilipe.apigithub.di.modules.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(level = Level.DEBUG)
//            androidContext(this@AppApplication) // caso algum module precise de u context, lembrando que nao a aconselhavel utilizar context em viewmodels
            modules( appModules )

        }
    }
}