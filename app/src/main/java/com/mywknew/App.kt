package com.mywknew

import android.app.Application
import org.greenrobot.eventbus.EventBus



/**
 * Created by heyuxin on 2018/5/10.
 */

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        EventBus.getDefault().post("string")
    }
}
