package com.example.progress_dialog_demo

import android.app.ProgressDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        waitButton.setOnClickListener {
            val dialog = ProgressDialog.show(this@MainActivity,"讀取中", "請等待3秒...", true)
            Thread(Runnable {
                try {
                    Thread.sleep(3000)
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    dialog!!.dismiss()
                }
            }).start()
        }
    }
}
