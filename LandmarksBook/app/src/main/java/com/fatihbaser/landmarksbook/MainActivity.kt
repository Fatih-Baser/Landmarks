package com.fatihbaser.landmarksbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var landmarkNames=ArrayList<String>()
        landmarkNames.add("Pisa")
        landmarkNames.add("Colleseum")
        landmarkNames.add("Eiffel")
        landmarkNames.add("London Bridge")

        val pisa=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aa)
        val a=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kutudakiler)
        val b=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aa)
        val c=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kutudakiler)

        var landmarkImages=ArrayList<Bitmap>()
        landmarkImages.add(pisa)
        landmarkImages.add(a)
        landmarkImages.add(b)
        landmarkImages.add(c)


        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)
        listview.adapter=adapter

        listview.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent= Intent(applicationContext,DetailsActivity::class.java)
            intent.putExtra("name",landmarkNames[position])
            startActivity(intent)
        }
    }
}