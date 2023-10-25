package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<Golden>
    lateinit var heading: Array<String>
    lateinit var imageId : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.haaland,
            R.drawable.mbappe,
            R.drawable.messi,
            R.drawable.p244855_t186_2023_1_001_000,
            R.drawable.p246333_t186_2023_1_001_000,
            R.drawable.p37055_t186_2023_1_001_000,
            R.drawable.silva
        )
        heading = arrayOf(
            "Erling Haaland",
            "Kylian Mbappe",
            "Lionel Messi",
            "Jude Bellingham",
            "Vinicius Junior",
            "Luka Modric",
            "Bernardo Silva"
        )
        newRecyclerView = findViewById(R.id.rV)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<Golden>()

        getData()
    }
    private fun getData(){
        for(i in imageId.indices){
            val arr = Golden(imageId[i],heading[i])
            newArrayList.add(arr)
        }
        newRecyclerView.adapter = Adapter(newArrayList)
    }

}