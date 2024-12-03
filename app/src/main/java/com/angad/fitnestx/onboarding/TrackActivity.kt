package com.angad.fitnestx.onboarding

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.angad.fitnestx.R
import com.angad.fitnestx.databinding.ActivityTrackBinding

class TrackActivity : AppCompatActivity() {

//    Creating an instance of binding
    private lateinit var binding: ActivityTrackBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

    //    Initialised the binding
        binding = ActivityTrackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    //    Go to the Burn activity
        binding.btnSplash1.setOnClickListener {
            val intent = Intent(this, BurnActivity::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.from_right, R.anim.from_right)
            startActivity(intent, options.toBundle())
            finish()
        }
    }
}