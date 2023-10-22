package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.L_btnmsuk
import kotlinx.android.synthetic.main.activity_login.L_img_1
import kotlinx.android.synthetic.main.activity_login.L_img_3
import kotlinx.android.synthetic.main.activity_login.Log_Daftar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        btnDaftarLogListener()
        btnMasukLogListener()
    }
    private fun btnBackLoginListener(){
        L_img_3.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }

    private fun btnDaftarLogListener(){
        Log_Daftar.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java ))
        }
    }
    private fun btnMasukLogListener(){
        L_btnmsuk.setOnClickListener {
            startActivity(Intent(this,Menu::class.java))
        }
    }

}