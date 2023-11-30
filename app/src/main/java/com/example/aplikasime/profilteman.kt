package com.example.aplikasime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class profilteman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilteman)

        val myDataList = mutableListOf<MyData>()

        myDataList.add(MyData(R.drawable.fauzan, "Fauzan Nur Rachman", "Halo aku adalah Fauzan Nur Rachman, ikuti Instagram @Fauzanrchmnn" ))
        myDataList.add(MyData(R.drawable.aku3, "Nilla Salsa Billa Putri ", "Hello aku adalah Nilla Salsa Billa Putri, Ikuti Instagram @Nillaaslsbillaaptr"))
        myDataList.add(MyData(R.drawable.a1, "FauzaNilla ", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a2, "FauzaNilla", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a3, "FauzaNilla", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a1, "FauzaNilla ", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a2, "FauzaNilla", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a3, "FauzaNilla", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a1, "FauzaNilla ", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a2, "FauzaNilla", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))
        myDataList.add(MyData(R.drawable.a3, "FauzaNilla", "Haloo... kami adalah Fauzan Nur Rachman dan Nilla Salsa Billa Putri, Ikuti Instagram kami @Fauzanrchmnn dan @Nillaaslsbilaaptr"))


        val myListView = findViewById<ListView>(R.id.list_teman)
        myListView.adapter = MyCustomAdapter(this,myDataList)

    }
}