package org.pythonbyte.krux.timer

class KruxTimer {
    private var startTime: Long = 0L
    private var stopTime: Long = 0L

    val result: Long
        get() = (stopTime - startTime) / 1_000_000

    fun start() {
        startTime = System.nanoTime()
    }

    fun stop() {
        stopTime = System.nanoTime()
    }

    fun stopPrint() {
        stop()
        println("Time taken: ${(stopTime - startTime) / 1_000_000} ms")
    }

    fun resetPrint() {
        stop()
        println("Time taken: ${(stopTime - startTime) / 1_000_000} ms")
        start()
    }
}
