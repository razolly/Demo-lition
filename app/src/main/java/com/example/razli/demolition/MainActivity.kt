package com.example.razli.demolition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: StringAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerview.layoutManager = LinearLayoutManager(this)
        adapter = StringAdapter()
        recyclerview.adapter = adapter
    }

    private fun getColorList(): List<String> {
        var colorList = mutableListOf<String>()
        colorList.add("red")
        colorList.add("yellow")
        colorList.add("green")
        colorList.add("blue")
        colorList.add("purple")
        return colorList
    }

    inner class StringAdapter : RecyclerView.Adapter<StringAdapter.MyViewHolder>() {

        lateinit var colors: ArrayList<String>

        override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
            val context = parent.applicationContext
            val inflater = LayoutInflater.from(context)

            // Inflate the custom layout
            val view = inflater.inflate(R.layout.color_item, p0, false)

            // Return a new holder instance
            return MyViewHolder(view)
        }

        override fun getItemCount(): Int {
            return colors.size
        }

        override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        }

        inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {

            private fun bind() {
                // bind the object to the view here
            }
        }

    }
}
