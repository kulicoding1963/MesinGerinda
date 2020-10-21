package com.gerinda.apps.utils

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.MediaController
import androidx.navigation.findNavController
import com.gerinda.apps.databinding.DialogVideoBinding
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy

fun PDFView.load(uri: String, activity: Activity? = null) {
    fromAsset(uri)
        .enableDoubletap(true)
        .swipeHorizontal(false)
        .defaultPage(0)
        .pageFling(true)
        .pageSnap(true)
        .autoSpacing(false)
        .spacing(0)
        .linkHandler {
            activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(it.link.uri)))
        }
        .pageFitPolicy(FitPolicy.BOTH)
        .fitEachPage(true)
        .load()
}

fun ImageView.back() {
    setOnClickListener {
        findNavController().navigateUp()
    }
}

fun Activity.dialogVideo(source: Int) {
    val videoPath: String? = "android.resource://" + this.packageName + "/" + source
    val dialog = Dialog(this, android.R.style.Theme_Material_Light)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    val binding: DialogVideoBinding = DialogVideoBinding.inflate(this.layoutInflater)
    dialog.setContentView(binding.root)
    dialog.setCanceledOnTouchOutside(true)

    binding.video.setVideoPath(videoPath)
    binding.video.start()
    binding.video.setOnPreparedListener {
        it?.let {
            val mediaController = MediaController(this)
            mediaController.setAnchorView(binding.video)
            binding.video.setMediaController(mediaController)
        }
    }
//    val uri: Uri = Uri.parse(videoPath)
//    binding.video.setVideoURI(uri)


//    binding.btnMulai.setOnClickListener {
//        if (binding.video.currentPosition > 100) {
//            binding.video.start()
//        } else {
//            binding.video.setVideoURI(uri)
//            binding.video.start()
//        }
//    }
//    binding.btnStop.setOnClickListener {
//        binding.video.pause()
//    }
    val lp = WindowManager.LayoutParams()
    lp.copyFrom(dialog.window!!.attributes)
    lp.width = WindowManager.LayoutParams.MATCH_PARENT
    lp.height = WindowManager.LayoutParams.WRAP_CONTENT
    dialog.window!!.attributes = lp
    dialog.show()
}