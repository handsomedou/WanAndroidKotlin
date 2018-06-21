package com.julien.wanandroidkotlin.ui.base

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.WindowManager

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayout(): Int
    abstract fun requestFullScreen(): Boolean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        if (requestFullScreen()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        }
    }



    protected fun requestSplash() {
        window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LOW_PROFILE or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }

}