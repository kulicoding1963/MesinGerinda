package com.gerinda.apps.utils

import android.widget.ImageView
import androidx.navigation.findNavController
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy

fun PDFView.load(uri: String) {
    fromAsset(uri)
        .enableDoubletap(true)
        .swipeHorizontal(false)
        .defaultPage(0)
        .autoSpacing(false)
        .spacing(0)
        .pageFitPolicy(FitPolicy.BOTH)
        .fitEachPage(true)
        .load()
}

fun ImageView.back() {
    setOnClickListener {
        findNavController().navigateUp()
    }
}