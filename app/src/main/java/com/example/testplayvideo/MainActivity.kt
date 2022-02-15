package com.example.testplayvideo

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val url = Uri.parse("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(url)
        videoView.requestFocus()
        videoView.start()

    }
}