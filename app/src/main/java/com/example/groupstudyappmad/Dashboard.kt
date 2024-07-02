package com.example.groupstudyappmad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)

        val getMyProfilebutton = findViewById<Button>(R.id.myprofiledashbutton)
        getMyProfilebutton.setOnClickListener{
            val Intent = Intent(this,MyProfile::class.java)
            startActivity(Intent)
        }

        val getMyGroupbutton = findViewById<Button>(R.id.mygroupsdashbtn)
        getMyGroupbutton.setOnClickListener{
            val Intent = Intent(this,MyGroups::class.java)
            startActivity(Intent)
        }

        val getCreateGroupbutton = findViewById<Button>(R.id.creategroupdashbtn)
        getCreateGroupbutton.setOnClickListener{
            val Intent = Intent(this,CreateGroup::class.java)
            startActivity(Intent)
        }

        val getLogoutbutton = findViewById<Button>(R.id.logoutdashbtn)
        getLogoutbutton.setOnClickListener{
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