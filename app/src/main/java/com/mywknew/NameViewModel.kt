package com.mywknew

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log


/**
 * Created by heyuxin on 2018/5/11.
 */
class NameViewModel : ViewModel() {
    init {
        Log.d("", "init")
    }
    // Create a LiveData with a String
    public val mCurrentName: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }

    override fun onCleared() {
        super.onCleared()
    }
//
//    val currentName: MutableLiveData<String>
//        get() {
//            if (mCurrentName == null) {
//                mCurrentName = MutableLiveData()
//            }
//            return mCurrentName as MutableLiveData<String>
//        }

    // Rest of the ViewModel...
}