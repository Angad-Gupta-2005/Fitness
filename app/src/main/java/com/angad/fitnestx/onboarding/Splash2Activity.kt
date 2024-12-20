package com.angad.fitnestx.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.angad.fitnestx.R
import com.angad.fitnestx.databinding.ActivitySplash2Binding

class Splash2Activity : AppCompatActivity() {

//    Creating an instance of binding
    private lateinit var binding: ActivitySplash2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//        Initialised the binding
        binding = ActivitySplash2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    //    Go to the track your goal activity
        binding.btnGetStarted.setOnClickListener {
            startActivity(Intent(this, TrackActivity::class.java))
            finish()
        }
    }
}