package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentVideoBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class VideoFragment : BaseFragment() {

    private val binding:FragmentVideoBinding by lazy {
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
    }


}