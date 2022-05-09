package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

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
        taskAdapter = Adapter(tasks)
        viewModel = RecycleViewModel(taskAdapter)
        mainBinding.viewModel = viewModel
        mainBinding.mainRecycler.run {
            layoutManager = LinearLayoutManager(context)
            this.adapter = taskAdapter
        }
        return mainBinding.root
    }

}