package com.mywknew

import android.app.Activity
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus

/**
 * Created by heyuxin on 2018/5/10.
 */

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val model = ViewModelProviders.of(this).get(NameViewModel::class.java)
        hello.setOnClickListener{
//            EventBus.getDefault().post("321")
            model.mCurrentName.value = "second"
        }
    }
}
