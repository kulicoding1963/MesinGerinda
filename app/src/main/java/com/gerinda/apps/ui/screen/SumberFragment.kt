package com.gerinda.apps.ui.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gerinda.apps.databinding.FragmentSumberBinding
import com.gerinda.apps.utils.back
import com.gerinda.apps.utils.load


class SumberFragment : Fragment() {

    private val binding: FragmentSumberBinding by lazy {
        FragmentSumberBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnBack.back()
        binding.pdf.load("sumber.pdf", requireActivity())
    }

}