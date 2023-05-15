package com.bunga.pahlawannasional

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.bunga.pahlawannasional.main.MainActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set your splash screen layout here
        setContentView(R.layout.activity_splash_screen)

        // Use a handler to delay the execution of code inside Runnable for SPLASH_DISPLAY_LENGTH milliseconds
        Handler().postDelayed({
            // Start your main activity here
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)

            // Finish the splash activity
            finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}