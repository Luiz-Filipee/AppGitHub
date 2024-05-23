package br.luizfilipe.apigithub.viewmodel.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.luizfilipe.apigithub.repositoris.UserRepository
import br.luizfilipe.apigithub.viewmodel.UserViewModel

//class UserViewModelFactory constructor(private val repository: UserRepository):
//    ViewModelProvider.Factory{
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return if(modelClass.isAssignableFrom(UserViewModel::class.java)){
//            UserViewModel(this.repository) as T
//        }else{
//            throw IllegalArgumentException("ViewModel Not Found")
//        }
//    }
//}