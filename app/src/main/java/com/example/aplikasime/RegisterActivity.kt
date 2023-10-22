package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.L_img_3
import kotlinx.android.synthetic.main.activity_register.R_btnmsk
import kotlinx.android.synthetic.main.activity_register.R_img_3
import kotlinx.android.synthetic.main.activity_register.txt_masuk

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnBackRegisterListener()
        btnDaftarRegisListener()
        btnMasukRegisListener()
    }
    private fun btnBackRegisterListener(){
        R_img_3.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
    private fun btnDaftarRegisListener(){
        R_btnmsk.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
    private fun btnMasukRegisListener(){
        txt_masuk.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}