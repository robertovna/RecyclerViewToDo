package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"

/**
 * A simple [Fragment] subclass.
 * Use the [MoreInfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MoreInfoFragment : Fragment() {
    private var textDetails: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            textDetails = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_more_info, container, false)
        val text = view.findViewById<TextView>(R.id.moreInfoText)
        arguments?.let {
            textDetails = it.getString(ARG_PARAM1)
        }
        text.text = textDetails
        return view
    }


}