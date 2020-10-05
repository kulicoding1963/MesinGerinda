package com.gerinda.apps.ui.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentTentangBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class TentangFragment : BaseFragment() {

    private val binding:FragmentTentangBinding by lazy {
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
    }

}