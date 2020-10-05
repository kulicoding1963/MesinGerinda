package com.gerinda.apps.ui.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentMateriDuaBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class MateriDuaFragment : BaseFragment() {

    private val binding:FragmentMateriDuaBinding by lazy {
        FragmentMateriDuaBinding.inflate(layoutInflater)
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
        binding.materiDuaSatu.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materiduasatu)
            bundle.putString(ContentMateriFragment.MATERI,"materiduasatu.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,21)
            findNavController().navigate(R.id.action_materiDuaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
        binding.materiDuaDua.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materiduadua)
            bundle.putString(ContentMateriFragment.MATERI,"materiduadua.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,22)
            findNavController().navigate(R.id.action_materiDuaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
        binding.materiDuaTiga.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materiduatiga)
            bundle.putString(ContentMateriFragment.MATERI,"materiduatiga.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,23)
            findNavController().navigate(R.id.action_materiDuaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
        binding.materiDuaEmpat.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materiduaempat)
            bundle.putString(ContentMateriFragment.MATERI,"materiduaempat.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,24)
            findNavController().navigate(R.id.action_materiDuaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
        binding.materiDuaLima.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materidualima)
            bundle.putString(ContentMateriFragment.MATERI,"materidualima.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,25)
            findNavController().navigate(R.id.action_materiDuaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
    }

}