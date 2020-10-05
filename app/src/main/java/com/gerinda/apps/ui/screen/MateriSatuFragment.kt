package com.gerinda.apps.ui.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentMateriSatuBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class MateriSatuFragment : BaseFragment() {

    private val binding:FragmentMateriSatuBinding by lazy {
        FragmentMateriSatuBinding.inflate(layoutInflater)
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
        binding.materiSatuSatu.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materisatusatu)
            bundle.putString(ContentMateriFragment.MATERI,"materisatusatu.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,11)
            findNavController().navigate(R.id.action_materiSatuFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
        binding.materiSatuDua.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materisatudua)
            bundle.putString(ContentMateriFragment.MATERI,"materisatudua.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,12)
            findNavController().navigate(R.id.action_materiSatuFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
    }
}