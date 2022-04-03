package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.RecycleViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding : ActivityMainBinding
    private lateinit var viewModel: RecycleViewModel
    private lateinit var taskAdapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var tasks = IntArray(25) { it }.map { "Item $it" }.toMutableList()
        taskAdapter = Adapter(tasks)
        viewModel = RecycleViewModel(taskAdapter)
        mainBinding.viewModel = viewModel
        mainBinding.mainRecycler.run {
            layoutManager = LinearLayoutManager(context)
            this.adapter = taskAdapter
        }



    }




}
