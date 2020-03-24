package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras    // getters and setters method
        val msg = bundle!!.getString("user_message")   // since we are using our nullable bundle we have to use !! nullable exception

        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()

        textView.text = " Hi  " + msg
    }
}
