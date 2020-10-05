package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentMenuUtamaBinding
import com.gerinda.apps.ui.base.BaseFragment


class MenuUtamaFragment : BaseFragment() {

    private val binding: FragmentMenuUtamaBinding by lazy {
        FragmentMenuUtamaBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.imgSilabus.setOnClickListener {
            findNavController().navigate(R.id.action_menuUtamaFragment_to_silabusFragment, null, getNavOptions())
        }
        binding.imgMateri.setOnClickListener {
            findNavController().navigate(R.id.action_menuUtamaFragment_to_materiFragment, null, getNavOptions())
        }
        binding.imgVideo.setOnClickListener {
            findNavController().navigate(R.id.action_menuUtamaFragment_to_videoFragment, null, getNavOptions())
        }
        binding.imgTentang.setOnClickListener {
            findNavController().navigate(R.id.action_menuUtamaFragment_to_tentangFragment, null, getNavOptions())
        }
        binding.imgKeluar.setOnClickListener {
            activity?.finish()
        }
    }

}