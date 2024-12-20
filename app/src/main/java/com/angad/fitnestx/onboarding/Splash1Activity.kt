package com.angad.fitnestx.onboarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.angad.fitnestx.databinding.ActivitySplash1Binding

class Splash1Activity : AppCompatActivity() {

//    Creating an instance of binding
    private lateinit var binidng: ActivitySplash1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//        Initialised the binding
        binidng = ActivitySplash1Binding.inflate(layoutInflater)
        setContentView(binidng.root)
        ViewCompat.setOnApplyWindowInsetsListener(binidng.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Splash2Activity::class.java))
            finish()
        }, 1500)
    }
}