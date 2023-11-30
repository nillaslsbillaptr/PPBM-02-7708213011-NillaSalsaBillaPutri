package com.example.aplikasime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rating.Rat_back
import kotlinx.android.synthetic.main.activity_rating.Rating_btn

class rating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
        supportActionBar?.hide()

        btnBackRatingListener()

        val ratingBar =findViewById<RatingBar>(R.id.Ratingbar)
        val Button = findViewById<Button>(R.id.Rating_btn)
        val ratingScale = findViewById<TextView>(R.id.Rating_text1)
        
        ratingBar.setOnRatingBarChangeListener { rBar, fl, b ->
            ratingScale.text = fl.toString()
            when (rBar.rating.toInt()){
                1 -> ratingScale.text="Buruk"
                2 -> ratingScale.text="Biasa"
                3 -> ratingScale.text="Baik"
                4 -> ratingScale.text="Sangat Baik"
                5 -> ratingScale.text="Luar Biasa"
                else -> ratingScale.text=" "
            }
        }


        Button.setOnClickListener{
            val message =ratingBar.rating.toString()
            Toast.makeText(this@rating,"Rating is: "+message, Toast.LENGTH_SHORT)
        }

        Rating_btn.setOnClickListener{
            val Intent = Intent (this,developer::class.java)
            startActivity(Intent)
        }
    }
    private fun btnBackRatingListener(){
        Rat_back.setOnClickListener{
            startActivity(Intent(this,developer::class.java))
        }
    }
}