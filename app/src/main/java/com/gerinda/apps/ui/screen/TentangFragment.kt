package com.gerinda.apps.ui.screen

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentTentangBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class TentangFragment : BaseFragment() {

    private val binding: FragmentTentangBinding by lazy {
        FragmentTentangBinding.inflate(layoutInflater)
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
        binding.imgForm.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/YXA2u5nuZnceAdyJ6")))
        }
        binding.imgTentang.setOnClickListener {
            findNavController().navigate(R.id.action_tentangFragment_to_pengembangFragment, null, getNavOptions())
        }
        binding.imgSumber.setOnClickListener {
            findNavController().navigate(R.id.action_tentangFragment_to_sumberFragment, null, getNavOptions())
        }
    }

}