package com.example.andersenmock.fragments.details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import com.example.andersenmock.R
import com.example.andersenmock.databinding.FragmentDetailsBinding
import com.example.andersenmock.databinding.FragmentHomeBinding
import com.example.andersenmock.fragments.home.HomeViewModel

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    private val viewModel: HomeViewModel by viewModels()
    private var receivedId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        receivedId = arguments?.getString("ID")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.receivedId.text = "Received Id Value is: $receivedId"
    }

    companion object {
        fun newInstance(id: String) = DetailsFragment().apply {
            arguments = bundleOf("ID" to id)
        }
    }
}