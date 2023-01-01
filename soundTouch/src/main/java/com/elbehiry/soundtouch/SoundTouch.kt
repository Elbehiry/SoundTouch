package com.elbehiry.soundtouch


class SoundTouch {

    companion object{
        init {
            System.loadLibrary("soundtouch")
        }
    }

    external fun newInstance(): Long
    external fun deleteInstance(handle: Long)
    external fun getVersionString(): String
    external fun getErrorString(): String

    external fun init(
        handle: Long,
        channels: Int,
        sampleRate: Int,
        tempo: Float,
        pitch: Float,
        speed: Float
    )

    external fun setRateChange(handle: Long, rateChange: Float)
    external fun setTempoChange(handle: Long, tempoChange: Float)
    external fun setTempo(handle: Long, tempo: Float)
    external fun setPitchSemiTones(handle: Long, pitch: Float)
    external fun setRate(handle: Long, speed: Float)
    external fun processFile(handle: Long, inputFile: String, outputFile: String): Int
    external fun putSamples(handle: Long, samples: ShortArray, len: Int)
    external fun receiveSamples(handle: Long, outputBuf: ShortArray): Int
    external fun flush(handle: Long, mp3buf: ShortArray): Int
}
