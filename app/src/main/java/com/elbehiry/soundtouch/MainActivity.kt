package com.elbehiry.soundtouch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val soundTouch: SoundTouch by lazy { SoundTouch() }
    private var soundTouchId: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soundTouchId = soundTouch.newInstance()

        findViewById<TextView>(R.id.soundTouchVersion).setText(
            "SoundTouch Version ${soundTouch.getVersionString()}"
        )

    }

    override fun onDestroy() {
        super.onDestroy()

        soundTouch.deleteInstance(soundTouchId)
    }
}