package com.example.mobileone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.net.PasswordAuthentication

class AccountInput : AppCompatActivity() {

    private lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_input)

        username = findViewById(R.id.username)

        val showUser = intent.getStringExtra("username")

        username.text = "Hello, $showUser"

    }
}