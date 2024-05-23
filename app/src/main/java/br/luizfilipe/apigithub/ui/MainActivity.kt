package br.luizfilipe.apigithub.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import br.luizfilipe.apigithub.api.UserApi
import br.luizfilipe.apigithub.databinding.ActivityMainBinding
import br.luizfilipe.apigithub.repositoris.UserRepositoryImp
import br.luizfilipe.apigithub.viewmodel.UserViewModel
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.GlobalContext.get

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val userViewModel: UserViewModel by viewModel()

//    private val userApi = get<UserApi>()
//
//    private val userRepository by inject<UserRepositoryImp>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializaObservaveis()

        binding.button.setOnClickListener {

            userViewModel.getAllUser()

            val username = binding.activityMainCampoNome.text.toString()

            if (username.isNotBlank()) {
                userViewModel.findUserByName(username)
            }

        }
    }

    private fun inicializaObservaveis() {

        userViewModel.user.observe(this, Observer { userOrNull ->

            userOrNull?.let { user ->

                Log.i("User", "inicializaObservaveis: ${user.login}")
                binding.activityMainNomeUser.text = user.login
                binding.activityMainBioUser.text = user.bio

            }
        })

    }
}
