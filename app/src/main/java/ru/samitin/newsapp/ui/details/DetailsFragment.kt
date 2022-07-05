package ru.samitin.newsapp.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.samitin.newsapp.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
    : View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }


}