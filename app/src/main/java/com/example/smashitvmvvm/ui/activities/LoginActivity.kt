package com.example.smashitvmvvm.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smashitvmvvm.R
import com.example.smashitvmvvm.ui.base.BaseActivity

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)
    }
}