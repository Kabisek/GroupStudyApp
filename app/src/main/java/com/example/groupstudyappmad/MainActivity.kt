package com.example.groupstudyappmad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.groupstudyappmad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val getStartbutton = findViewById<Button>(R.id.getstartbtn)
        getStartbutton.setOnClickListener{
            val Intent = Intent(this,LoginPage::class.java)
            startActivity(Intent)
        }
    }
}