package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.FragmentAddTaskBinding
import com.example.recyclerview.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AddTaskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddTaskFragment : Fragment() {
    private lateinit var mainBinding : FragmentAddTaskBinding
    private lateinit var viewModel: EditTextViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_add_task, container, false
        )
        viewModel = EditTextViewModel(findNavController())
        mainBinding.viewModel = viewModel
        return mainBinding.root
    }
}