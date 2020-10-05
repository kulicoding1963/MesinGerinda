package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentMateriEmpatBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back

class MateriEmpatFragment : BaseFragment() {

    private val binding:FragmentMateriEmpatBinding by lazy {
        FragmentMateriEmpatBinding.inflate(layoutInflater)
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
        binding.materiEmpatSatu.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materiempatsatu)
            bundle.putString(ContentMateriFragment.MATERI,"materiempatsatu.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,41)
            findNavController().navigate(R.id.action_materiEmpatFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
    }


}