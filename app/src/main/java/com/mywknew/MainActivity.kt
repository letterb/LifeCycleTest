package com.mywknew

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.uiThread


class MainActivity : AppCompatActivity() {
    private val mModel: NameViewModel by lazy{
        val model = ViewModelProviders.of(this).get(NameViewModel::class.java)
        val nameObserver = Observer<String> { newName ->
            hello.text = newName
        }
        model.mCurrentName.observe(this, nameObserver)
        model
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello.setOnClickListener {
            startActivity<SecondActivity>()
            // 测试当前MainActivity被隐藏后，5秒后再次返回MainActivity，能否更新数据
            doAsync {
                Thread.sleep(5000)
                uiThread {
                    mModel.mCurrentName.value = "click"
                }
            }
//            mModel.mCurrentName.value = "click"
        }
//        EventBus.getDefault().register(this);
//        EventBus.getDefault().post("string21")
//        mModel.mCurrentName.value = "vm"
    }

//    @Subscribe(threadMode = ThreadMode.MAIN)
//    fun onMessageEvent(event: String) {/* Do something */
//        hello.text = event
//    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onStop() {
        super.onStop()
    }
    override fun onDestroy() {
        super.onDestroy()
//        EventBus.getDefault().unregister(this)
    }
}
