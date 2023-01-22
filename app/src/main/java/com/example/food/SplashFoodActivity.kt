package com.example.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_food)
        var img = findViewById<ImageView>(R.id.image)
        img.alpha=0f
        img.animate().setDuration(2000).alpha(1f).withEndAction{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}