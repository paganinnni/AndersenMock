package com.example.andersenmock.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.andersenmock.MainActivity
import com.example.andersenmock.databinding.FragmentHomeBinding
import com.example.andersenmock.fragments.details.DetailsFragment
import com.example.andersenmock.fragments.favorites.FavoritesFragment

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.openDetailsButton.setOnClickListener {
            (requireActivity() as MainActivity).displayFragment(DetailsFragment.newInstance(
                id = "22"
            ))
        }
        binding.openFavoritesButton.setOnClickListener {
            (requireActivity() as MainActivity).displayFragment(FavoritesFragment.newInstance())
        }
    }
}