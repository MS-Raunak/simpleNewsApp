package com.ms.simplenewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ms.simplenewsapp.Adapter.NewsAdapter
import com.ms.simplenewsapp.Data.NewsData

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<NewsData>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var description : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adding dummy image
        imageId = arrayOf(
            R.drawable.ms,
            R.drawable.ms,
            R.drawable.ms,
            R.drawable.ms,
            R.drawable.ms,
            R.drawable.ms,
            R.drawable.ms,
            R.drawable.ms,
            R.drawable.ms
        )

        // Adding dummy heading
        heading = arrayOf(
            "Breaking News",
            "Breaking News",
            "Breaking News",
            "Breaking News",
            "Breaking News",
            "Breaking News",
            "Breaking News",
            "Breaking News",
            "Breaking News",
            "Breaking News",

        )

        // Adding dummy description
        description = arrayOf(
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match",
            " CSK’s captain MS Dhoni walks in the field to bat during the IPL 2023 match"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList = arrayListOf<NewsData>()
        getUserData()
    }

    private fun getUserData() {
        for (i in imageId.indices){
            val news = NewsData(imageId[i], heading[i], description[i])
            arrayList.add(news)
        }
        recyclerView.adapter = NewsAdapter(arrayList)
    }
}