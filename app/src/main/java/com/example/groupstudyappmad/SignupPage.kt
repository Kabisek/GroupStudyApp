package com.example.groupstudyappmad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)
        val Signtbutton = findViewById<Button>(R.id.signupbutton)
        Signtbutton.setOnClickListener{
            val Intent = Intent(this,LoginPage::class.java)
            startActivity(Intent)
        }
    }
}