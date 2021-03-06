package com.example.mussenger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mussenger.R
import com.example.mussenger.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentLoginBtn.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
        binding.fragmentRegBtn.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_registerFragment)
        }
    }

}