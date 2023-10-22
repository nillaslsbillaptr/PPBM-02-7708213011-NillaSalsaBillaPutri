package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_layanan.Ly_back

class Layanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan)

        btnBackLayanListener()
    }
    private fun btnBackLayanListener(){
        Ly_back.setOnClickListener {
            startActivity(Intent(this,Galeri::class.java))
        }
    }
}