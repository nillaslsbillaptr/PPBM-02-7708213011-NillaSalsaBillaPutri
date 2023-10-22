package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kelas_bahasa.B_img_3
import kotlinx.android.synthetic.main.activity_kelas_olahraga.O_img_3
import kotlinx.android.synthetic.main.activity_kelas_olahraga.O_layan

class KelasOlahraga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas_olahraga)
        supportActionBar?.hide()

        btnBack0rListener()
        btnlynOrListener()
    }
    private fun btnBack0rListener(){
        O_img_3.setOnClickListener {
            startActivity(Intent(this,Menu::class.java))
        }
    }
    private fun btnlynOrListener(){
        O_layan.setOnClickListener {
            startActivity(Intent(this,Layanan::class.java))
        }
    }
}