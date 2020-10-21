package com.gerinda.apps.ui.screen

import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.gerinda.apps.adapter.EvaluasiAdapter
import com.gerinda.apps.data.Evaluasi
import com.gerinda.apps.databinding.FragmentKuisBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class KuisFragment(private val subject: String, private val evaluasi: ArrayList<Evaluasi>) :
    BottomSheetDialogFragment() {
    private val binding: FragmentKuisBinding by lazy {
        FragmentKuisBinding.inflate(
            layoutInflater
        )
    }
    private lateinit var mBehavior: BottomSheetBehavior<*>

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        dialog.setContentView(binding.root)
        println("Data evaluasi : ${evaluasi.size}")
        mBehavior = BottomSheetBehavior.from(binding.root.parent as View)
        mBehavior.peekHeight = BottomSheetBehavior.PEEK_HEIGHT_AUTO

        val evaluasiAdapter = EvaluasiAdapter()
        binding.rvEvaluasi.layoutManager = LinearLayoutManager(requireContext())
//        binding.rvEvaluasi.setHasFixedSize(true)
//        binding.rvEvaluasi.isNestedScrollingEnabled = false
        binding.rvEvaluasi.adapter = evaluasiAdapter
        evaluasiAdapter.replaceAll(evaluasi)

        binding.btnBack.setOnClickListener { dismiss() }
        binding.imgWhat.setOnClickListener {
            val contact = "+6281226601682"
            val url = "https://api.whatsapp.com/send?phone=$contact"
            try {
                val pm = requireContext().packageManager
                pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
            } catch (e: PackageManager.NameNotFoundException) {
                Toast.makeText(requireContext(), "Whatsapp app not installed in your phone", Toast.LENGTH_SHORT)
                    .show()
                e.printStackTrace()
            }
        }

        binding.imgEmail.setOnClickListener {
            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf("jokopurnomo1995@gmail.com"))
            email.putExtra(Intent.EXTRA_SUBJECT, subject)
            email.type = "message/rfc822"
            startActivity(Intent.createChooser(email, "Choose an Email client :"))
        }
        return dialog
    }

    override fun onStart() {
        super.onStart()
        mBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

}