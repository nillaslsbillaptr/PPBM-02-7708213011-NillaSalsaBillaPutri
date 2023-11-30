package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.M_btnBahasa
import kotlinx.android.synthetic.main.activity_menu.M_btnIlmu
import kotlinx.android.synthetic.main.activity_menu.M_btnKom
import kotlinx.android.synthetic.main.activity_menu.M_btnOr
import kotlinx.android.synthetic.main.activity_menu.M_cerita
import kotlinx.android.synthetic.main.activity_menu.M_galeri
import kotlinx.android.synthetic.main.activity_menu.M_img_3
import kotlinx.android.synthetic.main.activity_menu.M_kontak
import kotlinx.android.synthetic.main.activity_profilteman.list_teman

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnBackMenuListener()
        btnIlmuMenuListener()
        btnKomMenuListener()
        btnOrMenuListener()
        btnBahasaMenuListener()
        btnGaleriMenuListener()
        btnKontakMenuListener()
        btnCeritaMenuListener()
    }
    private fun btnBackMenuListener(){
        M_img_3.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
    private fun btnIlmuMenuListener(){
        M_btnIlmu.setOnClickListener {
            startActivity(Intent(this,KelasIlmu::class.java))
        }
    }
    private fun btnKomMenuListener(){
        M_btnKom.setOnClickListener {
            startActivity(Intent(this,KelasKomputer::class.java))
        }
    }
    private fun btnOrMenuListener(){
        M_btnOr.setOnClickListener {
            startActivity(Intent(this,KelasOlahraga::class.java))
        }
    }
    private fun btnBahasaMenuListener(){
        M_btnBahasa.setOnClickListener {
            startActivity(Intent(this,KelasBahasa::class.java))
        }
    }
    private fun btnGaleriMenuListener(){
        M_galeri.setOnClickListener {
            startActivity(Intent(this,Galeri::class.java))
        }
    }
    private fun btnKontakMenuListener(){
        M_kontak.setOnClickListener {
            startActivity(Intent(this,Listkontak::class.java))
        }
    }
    private fun btnCeritaMenuListener(){
        M_cerita.setOnClickListener {
            startActivity(Intent(this,profilteman::class.java))
        }
    }
}