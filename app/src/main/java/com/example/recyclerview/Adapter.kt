package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R




class Adapter(private var items: MutableList<String>) : RecyclerView.Adapter<Adapter.EasyViewHolder>() {

    private lateinit var recyclerView: RecyclerView

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        this.recyclerView = recyclerView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EasyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.task, parent, false)
        itemView.setOnClickListener {
        }
        return EasyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EasyViewHolder, position: Int) {
        val textView = holder.itemView.findViewById<TextView>(R.id.checkToDoText)
        textView.text = items[position]
    }

    override fun getItemCount(): Int = items.size

    fun addTask(task: String) {
        items.add(task)
        notifyDataSetChanged()
    }

    class EasyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}