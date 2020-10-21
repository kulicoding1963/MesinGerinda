package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gerinda.apps.data.Evaluasi
import com.gerinda.apps.databinding.FragmentContentMateriBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.gerinda.apps.utils.back
import com.gerinda.apps.utils.load


class ContentMateriFragment : BaseFragment() {

    companion object {
        const val TOP = "TOP"
        const val MATERI = "MATERI"
        const val KUIS = "KUIS"
    }

    private val binding: FragmentContentMateriBinding by lazy {
        FragmentContentMateriBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        arguments?.takeIf { it.containsKey(MATERI) }?.apply {
            binding.pdf.load(getString(MATERI)!!)
            binding.btnBack.back()
            binding.imgTop.setImageResource(getInt(TOP))
            binding.imgMiniKuis.setOnClickListener {
                when(getInt(KUIS)){
                    11 -> {
                        val fragment = KuisFragment("SURFACE GRINDING MACHINE",fetchEvaluasiSatuSatu())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    12 ->{
                        val fragment = KuisFragment("PERLENGKAPAN MESIN GERINDA DATAR",fetchEvaluasiSatuDua())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    21 ->{
                        val fragment = KuisFragment("RODA GERINDA",fetchEvaluasiDuaSatu())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    22 ->{
                        val fragment = KuisFragment("BENTUK RODA GERINDA",fetchEvaluasiDuaDua())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    23 ->{
                        val fragment = KuisFragment("IDENTITAS RODA GERINDA",fetchEvaluasiDuaTiga())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    24 ->{
                        val fragment = KuisFragment("PEMBENTUKAN DAN PENGASAHAN RODA GERINDA",fetchEvaluasiDuaEmpat())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    25 ->{
                        val fragment = KuisFragment("MENYETIMBANGKAN RODA GERINDA",fetchEvaluasiDuaLima())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    31 ->{
                        val fragment = KuisFragment("PARAMETER PEMOTONGAN POS",fetchEvaluasiTigaSatu())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    32 ->{
                        val fragment = KuisFragment("PARAMETER PEMOTONGAN RPM",fetchEvaluasiTigaDua())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    33 ->{
                        val fragment = KuisFragment("PARAMETER PEMOTONGAN WAKTU PROSES PEMESINANNYA",fetchEvaluasiTigaTiga())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                    41 ->{
                        val fragment = KuisFragment("TEKNIK PENGGERINDAAN DATAR",fetchEvaluasiEmpatSatu())
                        fragment.setTargetFragment(this@ContentMateriFragment, 1)
                        fragment.show(parentFragmentManager, fragment.tag)
                    }
                }
            }
        }
    }

    private fun fetchEvaluasiSatuSatu(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Simpulkan pengertian mesin gerinda datar, fungsi dari mesin gerinda datar, dan prinsip kerja mesin gerinda datar!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Kelompokan jenis mesin gerinda datar berdasarkan sumbu utama mesin dan pelayanan pengoperasian mesin gerinda datar!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Tentukan persamaan dari bagian utama mesin gerinda datar spindle horizontal dan spindle vertical!")
        )
        return listMenu
    }

    private fun fetchEvaluasiSatuDua(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Kelompokan 3 jenis utama perlengkapan mesin gerinda datar disertai contohnya dan fungsinya!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Bagaimana cara mengoperasikan mesin gerinda datar spindel horizontal sesuai SOP?")
        )
        return listMenu
    }

    private fun fetchEvaluasiDuaSatu(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Simpulkan pengertian roda gerinda, proses pembuatanya, dan fungsi roda gerinda!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Tentukan jenis butiran asah dan perekat yang sesuai untuk penggerindaan alat-alat potong! Dan jelaskan alasannya!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Apa yang dapat membedakan tingkat kekerasan dari sebuah batu gerinda! Jelaskan!")
        )
        return listMenu
    }

    private fun fetchEvaluasiDuaDua(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Dari uraian materi tersebut bentuk batu gerinda apa yang digunakan untuk penggerindaan alur V? coba jelaskan alasan pemilihan batu gerinda tersebut!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Gambarkan bentuk penampang dari roda gerinda mangkuk kerucut dan roda gerinda mangkuk lurus! Apa yang membedakan bentuk roda gerinda mangkuk kerucut dan lurus?")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Gambarkan bentuk roda gerinda bentuk khusus dan uraikan pendapat anda tentang batu gerinda tersebut!")
        )
        return listMenu
    }

    private fun fetchEvaluasiDuaTiga(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Identifikasikan roda gerinda dengan identitas A 36 L 5 V BE ! jelaskan karakteristik dari roda gerinda tersebut!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Identifikasikan roda gerinda dengan identitas 38 A 100 R 5 V BE! Jelaskan karakteristik dari batu gerinda tersebut!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Jelaskan fungsi dari masing-masing butiran asah aluminium oksida dan silikon karbida!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Jelaskan fungsi dari masing-masing bahan perekat tembikar, silikat, dan karet!")
        )
        return listMenu
    }

    private fun fetchEvaluasiDuaEmpat(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Mengapa roda gerinda perlu diasah? Tentukan langkah-langkah dalam proses pengasahan batu gerinda (dressing)!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Apa yang dimaksud dengan trueing dan dressing? Jelaskan!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Coba selidiki bagaimana glazing dan loading bisa terjadi pada roda gerinda!")
        )
        return listMenu
    }

    private fun fetchEvaluasiDuaLima(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Mengapa roda gerinda perlu disetimbangkan terlebih dahulu sebelum dipakai?")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Apa tujuan untuk menyetimbangkan roda gerinda? Coba simpulkan!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Coba tentukan faktor apa yang membuat roda gerinda tidak setimbang!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Bagaimana cara memasang roda gerinda? gambarkan secara sederhana!")
        )
        return listMenu
    }

    private fun fetchEvaluasiTigaSatu(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Sebuah roda gerinda berdiameter 250 mm mempunyai kecepatan putar 2200 rpm. Hitunglah kecepatan keliling roda gerinda tersebut!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Sebuah roda gerinda mempunyai kecepatan putar 2000 rpm, sedang kan kecepatan keliling roda gerinda 28,26 meter/detik. Hitunglah diameter dari roda gerinda tersebut!")
        )
        return listMenu
    }

    private fun fetchEvaluasiTigaDua(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Sebuah roda gerinda berdiameter (d) 180 mm, akan digunakan dengan kecepatan keliling (POS) sebesar 28 meter/det. Hitung berapa kecepatan putar roda gerinda tersebut!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Sebuah benda kerja berbentuk balok persegi panjang memiliki ukuran panjang (l) 360 mm, akan di gerinda datar dengan roda gerinda berdiameter 300 mm. Hitung panjang langkah penggerindaan datar gerak memanjangnya!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Sebuah benda kerja berbentuk balok persegi panjang memiliki ukuran lebar (A)= 180 mm, akan dilakukan penggerindaan datar dengan lebar roda gerinda (b)= 20 mm. Hitung panjang langkah penggerindaan datar gerak melintangnya!")
        )
        return listMenu
    }

    private fun fetchEvaluasiTigaTiga(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Sebuah benda kerja berbentuk persegi panjang memiliki ukuran panjang (l) 320 mm dan lebarnya 16 mm, akan dilakukan penggerindaan datar tanpa pergeseran meja dengan diameter roda gerinda (d) 250 mm, jumlah pemakanan (i) 6 kali dan kecepatan gerak meja 4 meter/menit. Hitung waktu pemesinannya!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Sebuah benda kerja berbentuk persegi panjang memiliki ukuran panjang (l) 200 mm dan lebarnya (A) 100 mm, akan dilakukan penggerindaan datar dengan pergeseran meja. Menggunakan diameter roda gerinda (d) 240 mm dan lebarnya (b) 22 mm, jumlah pemakanan (i) 6 kali, kecepatan gerak meja (F) 4 meter/menit dan pemakanan menyamping (f) 14 mm. Hitung waktu pemesinannya!.")
        )
        return listMenu
    }

    private fun fetchEvaluasiEmpatSatu(): ArrayList<Evaluasi> {
        val listMenu: ArrayList<Evaluasi> = ArrayList()
        listMenu.add(
            Evaluasi(evaluasi = "Jelaskan dengan singkat, persyaratan apa saja yang harus dilakukan sebelum melakukan penggerindaan datar dengan meja magnetic!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Jelaskan dengan singkat, cara pengikatan benda kerja dengan meja magnetik yang memiliki ukuran relatif panjang dan lebar, kecil dan tinggi!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Jelaskan dengan singkat, persyaratan apa saja yang harus dilakukan sebelum melakukan penggerindaan datar dengan ragum presisi!")
        )
        listMenu.add(
            Evaluasi(evaluasi = "Jelaskan dengan singkat, cara pengikatan benda kerja dengan ragum presisi yang memiliki ukuran relatif pendek dan panjang!")
        )
        return listMenu
    }
}