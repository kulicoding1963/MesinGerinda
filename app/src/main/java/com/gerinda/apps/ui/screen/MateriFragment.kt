package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentMateriBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class MateriFragment : BaseFragment() {

    private val binding:FragmentMateriBinding by lazy {
        FragmentMateriBinding.inflate(layoutInflater)
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
        binding.materiSatu.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiSatuFragment,null,getNavOptions())
        }
        binding.materiDua.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiDuaFragment,null,getNavOptions())
        }
        binding.materiTiga.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiTigaFragment,null,getNavOptions())
        }
        binding.materiEmpat.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiEmpatFragment,null,getNavOptions())
        }

    }

}