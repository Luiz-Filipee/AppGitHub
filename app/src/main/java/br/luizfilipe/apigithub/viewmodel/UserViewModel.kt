package br.luizfilipe.apigithub.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.luizfilipe.apigithub.model.User
import br.luizfilipe.apigithub.repositoris.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    private val _user = MutableLiveData<User>()

    val user: LiveData<User> = _user

    fun getAllUser() = viewModelScope.launch {

        val users = userRepository.getAllUser()

        for (user in users) {
            Log.i("Users", user.login)
        }

    }

    fun findUserByName(name: String) = viewModelScope.launch {

        try {

            val userEncontrado = userRepository.findUserByName(name)
            Log.i("Users", "findUserByName: $userEncontrado")

            _user.postValue(userEncontrado)

        } catch (e: Exception) {

            Log.e("ViewModel", "findUserByName: erro ao buscar usuario", e)

        }
    }
}