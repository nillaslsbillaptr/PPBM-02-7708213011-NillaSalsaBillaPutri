package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnLoginListener()
    }

    private fun btnLoginListener(){
    btn1.setOnClickListener {
        startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}

