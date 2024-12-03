package com.angad.fitnestx.onboarding

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.angad.fitnestx.R
import com.angad.fitnestx.databinding.ActivityBurnBinding

class BurnActivity : AppCompatActivity() {

//    Creating an instance of binding
    private lateinit var binding: ActivityBurnBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

    //    Initialised the binding
        binding = ActivityBurnBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    //    Go to the Eat activity
        binding.btnSplash2.setOnClickListener {
            val intent = Intent(this, EatActivity::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.from_right, R.anim.from_right)
            startActivity(intent, options.toBundle())
            finish()
        }
    }
}