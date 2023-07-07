package edu.xfoleks.safepassword.presentation.ui.activities.splashscreen

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import edu.xfoleks.safepassword.presentation.ui.activities.main.MainActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            installSplashScreen()
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
        } else {
            actionBar?.hide()
            Handler().postDelayed({
                startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
                finish()
            }, 3000)
        }
    }
}