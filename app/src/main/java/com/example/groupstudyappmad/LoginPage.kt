package com.example.groupstudyappmad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        val getSigntbutton = findViewById<Button>(R.id.signuploginbtn)
        getSigntbutton.setOnClickListener{
            val Intent = Intent(this,SignupPage::class.java)
            startActivity(Intent)
        }

        val getLogintbutton = findViewById<Button>(R.id.loginbutton)
        getLogintbutton.setOnClickListener{
            val Intent = Intent(this,Dashboard::class.java)
            startActivity(Intent)
        }
    }
}