package com.gerinda.apps.ui.screen

import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gerinda.apps.databinding.FragmentPengembangBinding
import com.gerinda.apps.utils.back


class PengembangFragment : Fragment() {

    private val binding:FragmentPengembangBinding by lazy {
        FragmentPengembangBinding.inflate(layoutInflater)
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
        binding.imgWhats.setOnClickListener {
            val contact = "+6281226601682"
//            val contact = "+628122660134343"
            val message = "Halo pak"
            val url = "https://api.whatsapp.com/send?phone=$contact&text=${message}"
            try {
                val pm = requireContext().packageManager
                pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
                val i = Intent(Intent.ACTION_VIEW)
                i.type = "text/plain"
                val text = "YOUR TEXT HERE"
                i.putExtra(Intent.EXTRA_TEXT,text)
                i.data = Uri.parse(url)
                startActivity(i)
            } catch (e: PackageManager.NameNotFoundException) {
                Toast.makeText(requireContext(), "Whatsapp app not installed in your phone", Toast.LENGTH_SHORT)
                    .show()
                e.printStackTrace()
            }
        }

        binding.imgMail.setOnClickListener {
            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf("jokopurnomo1995@gmail.com"))
            email.putExtra(Intent.EXTRA_SUBJECT, "Media Mesin Gerinda")
            email.type = "message/rfc822"
            startActivity(Intent.createChooser(email, "Choose an Email client :"))
        }
        binding.imgInsta.setOnClickListener {
            val uri: Uri = Uri.parse("http://instagram.com/_u/jkprnm")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)
            likeIng.setPackage("com.instagram.android")
            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/jkprnm")
                    )
                )
            }
        }

    }

}