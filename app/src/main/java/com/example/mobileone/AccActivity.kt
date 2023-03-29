package com.example.mobileone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AccActivity : AppCompatActivity() {

    private lateinit var user: EditText
    private lateinit var btsignup: Button

    private fun idfungsi(){
        user = findViewById(R.id.username)
        btsignup = findViewById(R.id.signupbutton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acc)

        idfungsi()

        btsignup.setOnClickListener{
            startActivity(Intent(this, AccountInput::class.java)
                .putExtra("username", user.text.toString())
            )
        }
    }
}