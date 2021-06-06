package com.syncmob.numberlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.syncmob.numberlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val array = arrayOf(
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16"
        )
        //val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
        //binding.mylist.adapter = adapter

        val arrayList: ArrayList<Data> = ArrayList()
        arrayList.add(Data("0", "audio_0"))
        arrayList.add(Data("1", "audio_1"))
        arrayList.add(Data("2", "audio_2"))
        arrayList.add(Data("3", "audio_3"))
        arrayList.add(Data("4", "audio_4"))
        arrayList.add(Data("5", "audio_5"))
        arrayList.add(Data("6", "audio_6"))
        arrayList.add(Data("7", "audio_7"))
        arrayList.add(Data("8", "audio_8"))
        arrayList.add(Data("9", "audio_9"))
        arrayList.add(Data("10", "audio_10"))

        val adapter: CustomAdapter = CustomAdapter(arrayList)
        binding.mylist.adapter = adapter

    }
}