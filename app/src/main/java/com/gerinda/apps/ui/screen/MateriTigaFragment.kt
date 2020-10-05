package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gerinda.apps.R
import com.gerinda.apps.databinding.FragmentMateriTigaBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back


class MateriTigaFragment : BaseFragment() {

    private val binding:FragmentMateriTigaBinding by lazy {
        FragmentMateriTigaBinding.inflate(layoutInflater)
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
        binding.materiTigaSatu.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materitigasatu)
            bundle.putString(ContentMateriFragment.MATERI,"materitigasatu.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,31)
            findNavController().navigate(R.id.action_materiTigaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
        binding.materiTigaDua.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materitigadua)
            bundle.putString(ContentMateriFragment.MATERI,"materitigadua.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,32)
            findNavController().navigate(R.id.action_materiTigaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
        binding.materiTigaTiga.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt(ContentMateriFragment.TOP,R.drawable.materitigatiga)
            bundle.putString(ContentMateriFragment.MATERI,"materitigatiga.pdf")
            bundle.putInt(ContentMateriFragment.KUIS,33)
            findNavController().navigate(R.id.action_materiTigaFragment_to_contentMateriFragment,bundle,getNavOptions())
        }
    }


}