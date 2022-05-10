package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.Nullable
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    private lateinit var mainBinding : FragmentMainBinding
    private lateinit var viewModel: RecycleViewModel
    private lateinit var taskAdapter: Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main, container, false
        )

        var tasks = IntArray(25) { it }.map { "Item $it" }.toMutableList()
        var text = ""
        arguments?.let {
            text = it.getString("editparam")!!
        }
        if (text != "")
            tasks.add(text)
        taskAdapter = Adapter(tasks, findNavController())
        viewModel = RecycleViewModel(findNavController())
        mainBinding.viewModel = viewModel
        mainBinding.mainRecycler.run {
            layoutManager = LinearLayoutManager(context)
            this.adapter = taskAdapter
        }
        return mainBinding.root
    }

}