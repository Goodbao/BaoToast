package com.bao.baotoast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnShortToast).setOnClickListener {
            ToastUtils.shortToast(R.string.normal_toast)
        }

        findViewById<Button>(R.id.btnLongToast).setOnClickListener {
            ToastUtils.longToast(getString(R.string.long_toast))
        }

        findViewById<Button>(R.id.btnCenterToast).setOnClickListener {
            ToastUtils.setToastGravity(Gravity.CENTER, 0, 0)
            ToastUtils.shortToast(R.string.center_toast)
        }

        findViewById<Button>(R.id.btnBottomToast).setOnClickListener {
            ToastUtils.setToastGravity(Gravity.BOTTOM, 0, 100)
            ToastUtils.shortToast(R.string.bottom_toast)
        }

        findViewById<Button>(R.id.btnImageToast).setOnClickListener {
            ToastUtils.shortImageToast(R.string.image_toast)
        }
    }
}
