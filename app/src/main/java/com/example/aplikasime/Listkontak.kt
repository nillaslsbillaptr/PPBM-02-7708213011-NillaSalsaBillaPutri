package com.example.aplikasime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_listkontak.lv_namakontak

class Listkontak : AppCompatActivity() {

    val kontak = arrayOf("Fauzan", "Nur", "Rachman", "Nilla", "Salsa", "Billa", "Putri", "Desti", "Intan", "Cut", "Yoana", "Luci", "Teguh", "Safwa", "Tiger", "Aditya", "Maulana")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listkontak)

        val adapter = ArrayAdapter (this, android.R.layout.simple_list_item_1,kontak )
        lv_namakontak.adapter = adapter

        lv_namakontak.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "ini adalah kontak ${kontak[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}