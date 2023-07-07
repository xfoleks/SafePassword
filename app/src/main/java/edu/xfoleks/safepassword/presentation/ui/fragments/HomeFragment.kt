package edu.xfoleks.safepassword.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import edu.xfoleks.safepassword.R
import edu.xfoleks.safepassword.databinding.FragmentHomeBinding
import edu.xfoleks.safepassword.presentation.viemodels.SharedViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel: SharedViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        viewModel.countOfCreatedPasswords.observe(viewLifecycleOwner) { count ->
            binding.message.text = resources.getString(R.string.home_screen_message, count)
        }

        return binding.root
    }
}