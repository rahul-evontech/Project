
package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            Log.e("MainActivity", "Button was clicked")

            val message: String = editText.text.toString()
            val password: String = editText4.text.toString()

//            Toast.makeText(this,message,Toast.LENGTH_LONG).show()
            var i = 0
            if((message == "abc@gmail.com" ) && (password == "abc")) {
                i = 1
            }
            else if((message == "def@gmail.com") && (password == "def")) {
                i = 1
            }
            else if((message == "pqr@gmail.com") && (password == "pqr")){
                i = 1
            }
            else if((message == "lmn@gmail.com") && (password == "lmn")){
                i = 1
            }
            else if((message == "xyz@gmail.com") && (password == "xyz")){
                i = 1
            }
            else if((message == "sqr@gmail.com") && (password == "sqr")){
                i = 1
            }

            if (i == 1){
                val intent1 = Intent(this, SecondActivity::class.java)            //explicit intent
                intent1.putExtra("user_message", message)       // putExtra is used for sending the message
                startActivity(intent1)
            }
            else //explicit intent
                // putExtra is used for sending the message
                if(i == 0){
                        Toast.makeText(this,"Wrong mail id or password",Toast.LENGTH_LONG).show()
                    }
            }
        button2.setOnClickListener{
            val message: String = editText.text.toString()
            val intent = Intent()  // No paprameters because we don't know to which app we have to send our data
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)  // Intent.EXTRA_TEXT are predefined keys known to other applications
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share to: "))


        }
    }
}

