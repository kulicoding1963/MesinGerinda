package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentVideoBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class VideoFragment : BaseFragment() {

    private val binding: FragmentVideoBinding by lazy {
        FragmentVideoBinding.inflate(layoutInflater)
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
        binding.imgDressing.setOnClickListener {
            val bundle = Bundle().apply {
//                putInt(ContentVideoFragment.RESOURCE,R.raw.dressing)
                putString(ContentVideoFragment.LINK,"Knvb87-va4c")
            }
            findNavController().navigate(R.id.action_videoFragment_to_contentVideoFragment, bundle, getNavOptions())
        }
        binding.imgBerputarHoriz.setOnClickListener {
            val bundle = Bundle().apply {
//                putInt(ContentVideoFragment.RESOURCE,R.raw.putarhoriz)
                putString(ContentVideoFragment.LINK,"Ckm0I0wPLkw")
            }
            findNavController().navigate(R.id.action_videoFragment_to_contentVideoFragment, bundle, getNavOptions())
        }
        binding.imgBerputarVerti.setOnClickListener {
            val bundle = Bundle().apply {
//                putInt(ContentVideoFragment.RESOURCE,R.raw.putarverti)
                putString(ContentVideoFragment.LINK,"15LAwfJxmhU")
            }
            findNavController().navigate(R.id.action_videoFragment_to_contentVideoFragment, bundle, getNavOptions())
        }
        binding.imgBalikHoriz.setOnClickListener {
            val bundle = Bundle().apply {
//                putInt(ContentVideoFragment.RESOURCE,R.raw.balikhoriz)
                putString(ContentVideoFragment.LINK,"iOZx72XoC7Y")
            }
            findNavController().navigate(R.id.action_videoFragment_to_contentVideoFragment, bundle, getNavOptions())
        }
        binding.imgBalikVerti.setOnClickListener {
            val bundle = Bundle().apply {
//                putInt(ContentVideoFragment.RESOURCE,R.raw.balikverti)
                putString(ContentVideoFragment.LINK,"soBPKhxpaBg")
            }
            findNavController().navigate(R.id.action_videoFragment_to_contentVideoFragment, bundle, getNavOptions())
        }
        binding.imgBalancing.setOnClickListener {
            val bundle = Bundle().apply {
//                putInt(ContentVideoFragment.RESOURCE,R.raw.balancing)
                putString(ContentVideoFragment.LINK,"RJVn-G2nZaQ")
            }
            findNavController().navigate(R.id.action_videoFragment_to_contentVideoFragment, bundle, getNavOptions())
        }
    }


}