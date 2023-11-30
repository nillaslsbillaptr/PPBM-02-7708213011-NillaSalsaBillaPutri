package com.example.aplikasime

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter (val ctx : Context, val myDataList: List<MyData>) : BaseAdapter() {
    override fun getCount(): Int {
        return myDataList.size
    }

    override fun getItem(position: Int): MyData {
        return myDataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int,  convertView: View?, parent: ViewGroup?): View {
        var myconvertView = convertView
        if (myconvertView == null) {
            myconvertView = LayoutInflater.from(ctx).inflate(R.layout.my_listteman_item,parent,false)
        }
        val currentItem = getItem(position)

        val imageItem = myconvertView?.findViewById<ImageView>(R.id.listteman_image)
        val titleItem = myconvertView?.findViewById<TextView>(R.id.listteman_title)
        val descItem = myconvertView?.findViewById<TextView>(R.id.listteman_desc)

        imageItem?.setImageResource(currentItem.image)
        titleItem?.text = currentItem.title
        descItem?.text = currentItem.desc

        return myconvertView!!
    }
}