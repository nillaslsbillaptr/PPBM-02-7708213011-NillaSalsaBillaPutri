package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kelas_bahasa.B_img_3
import kotlinx.android.synthetic.main.activity_kelas_ilmu.I_btnlyn
import kotlinx.android.synthetic.main.activity_kelas_ilmu.I_img_3

class KelasIlmu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas_ilmu)

        btnBackIlmuListener()
        btnLayanIlmuListener()
}
private fun btnBackIlmuListener(){
    I_img_3.setOnClickListener {
        startActivity(Intent(this,Menu::class.java))
    }
}
private fun btnLayanIlmuListener(){
    I_btnlyn.setOnClickListener {
        startActivity(Intent(this,Layanan::class.java))
        }
    }
}