package com.gerinda.apps.ui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gerinda.apps.databinding.FragmentContentVideoBinding
import com.gerinda.apps.ui.base.BaseFragment
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener


class ContentVideoFragment : BaseFragment() {
    private val binding:FragmentContentVideoBinding by lazy {
        FragmentContentVideoBinding.inflate(layoutInflater)
    }
    companion object{
        const val RESOURCE = "RESOURCE"
        const val LINK = "LINK"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setVideo()
    }

    override fun onResume() {
        super.onResume()
        setVideo()
    }

    private fun setVideo(){
        arguments?.let { args ->
//            binding.imgSumber.setOnClickListener {
//                activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(args.getString(LINK))))
//            }
//            val videoPath: String? = "android.resource://" + requireActivity().packageName + "/" + args.getInt(RESOURCE)
//            binding.videoView.setMediaController(MediaController(requireContext()))
//            val uri: Uri = Uri.parse(videoPath)
//            binding.videoView.setVideoURI(uri)
//            binding.videoView.requestFocus()
//            binding.videoView.start()
            lifecycle.addObserver(binding.youtube)
            binding.youtube.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = args.getString(LINK)!!
                    youTubePlayer.loadVideo(videoId, 0f)
                }
            })
        }
    }
}