package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_developer.Dev_back
import kotlinx.android.synthetic.main.activity_developer.Dev_btnrating

class developer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)
        supportActionBar?.hide()

        btnBackDevListener()
        btnNilaiDevListener()
    }
    private fun btnBackDevListener(){
        Dev_back.setOnClickListener {
            startActivity(Intent(this,Menu::class.java))
        }
    }
    private fun btnNilaiDevListener(){
        Dev_btnrating.setOnClickListener {
            startActivity(Intent(this,rating::class.java))
        }
    }
}