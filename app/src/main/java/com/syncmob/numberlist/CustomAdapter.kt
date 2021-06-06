package com.syncmob.numberlist

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var arrayList: ArrayList<Data>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context
        var rowView: View? = convertView
        var mediaPlayer: MediaPlayer? = null

        val inflater: LayoutInflater =
            context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        if (rowView == null) {
            rowView = inflater.inflate(R.layout.item_list, parent, false)
        }

        val textView = rowView?.findViewById<TextView>(R.id.txtview)
        val item = arrayList[position]
        textView?.text = item.number

        val audioimg = rowView?.findViewById<ImageView>(R.id.imgview)
        audioimg?.setOnClickListener {

            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(
                    context,
                    context.resources.getIdentifier(
                        item.audioFileName,
                        "raw",
                        context.packageName
                    )
                )
            }
            mediaPlayer?.start()
        }

        return rowView!!
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }
}