package com.example.groupstudyappmad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_profile)

        val getMyProfileLogoutbutton = findViewById<Button>(R.id.profilelogoutbtn)
        getMyProfileLogoutbutton.setOnClickListener{
            val Intent = Intent(this,LoginPage::class.java)
            startActivity(Intent)
        }

        val getnav1button = findViewById<ImageButton>(R.id.navdash1)
        getnav1button.setOnClickListener{
            val Intent = Intent(this,Dashboard::class.java)
            startActivity(Intent)
        }

        val getnav2button = findViewById<ImageButton>(R.id.navdash2)
        getnav2button.setOnClickListener{
            val Intent = Intent(this,CreateGroup::class.java)
            startActivity(Intent)
        }

        val getnav3button = findViewById<ImageButton>(R.id.navdash3)
        getnav3button.setOnClickListener{
            val Intent = Intent(this,MyGroups::class.java)
            startActivity(Intent)
        }

        val getnav4button = findViewById<ImageButton>(R.id.imageButton4)
        getnav4button.setOnClickListener{
            val Intent = Intent(this,MyProfile::class.java)
            startActivity(Intent)
        }
    }
}