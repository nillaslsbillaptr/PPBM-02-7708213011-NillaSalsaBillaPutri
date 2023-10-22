package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_galeri.G_btnB
import kotlinx.android.synthetic.main.activity_galeri.G_btnI
import kotlinx.android.synthetic.main.activity_galeri.G_btnK
import kotlinx.android.synthetic.main.activity_galeri.G_btnO
import kotlinx.android.synthetic.main.activity_galeri.G_btndev
import kotlinx.android.synthetic.main.activity_galeri.btnGBack

class Galeri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)
        supportActionBar?.hide()

        btnGoIListener()
        btnGoKListener()
        btnGoOListener()
        btnGoBListener()
        btnGoDevListener()
        btnGBackListener()
    }

    private fun btnGoIListener() {
        G_btnI.setOnClickListener {
            startActivity(Intent(this, KelasIlmu::class.java))
        }
    }

    private fun btnGoKListener() {
        G_btnK.setOnClickListener {
            startActivity(Intent(this, KelasKomputer::class.java))
        }
    }

    private fun btnGoOListener() {
        G_btnO.setOnClickListener {
            startActivity(Intent(this, KelasOlahraga::class.java))
        }
    }

    private fun btnGoBListener() {
        G_btnB.setOnClickListener {
            startActivity(Intent(this, KelasBahasa::class.java))
        }
    }

    private fun btnGoDevListener(){
        G_btndev.setOnClickListener {
            startActivity(Intent(this,developer::class.java))
        }
    }
    private fun btnGBackListener(){
        btnGBack.setOnClickListener {
            startActivity(Intent(this,Menu::class.java))
        }
    }
}