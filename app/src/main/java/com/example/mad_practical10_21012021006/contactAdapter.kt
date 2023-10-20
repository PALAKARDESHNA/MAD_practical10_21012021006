package com.example.mad_practical10_21012021006

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class contactAdapter(val context: Context, val array:ArrayList<contect>):ArrayAdapter<contect>(context,0,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listviewlayout,parent)

        return view
    }
}