package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kelas_bahasa.B_btnlyn
import kotlinx.android.synthetic.main.activity_kelas_bahasa.B_img_3

class KelasBahasa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas_bahasa)
        supportActionBar?.hide()

        btnBackBahasaListener()
        btnLayanBahasaListener()
    }
    private fun btnBackBahasaListener(){
        B_img_3.setOnClickListener {
            startActivity(Intent(this,Menu::class.java))
        }
    }
    private fun btnLayanBahasaListener(){
        B_btnlyn.setOnClickListener {
            startActivity(Intent(this,Layanan::class.java))
        }
    }
}