package com.example.designpattern.facade

/**
 * 硬件：cpu
 */
class Cpu : Component {
    override fun stop() {
        println("停止cpu")
    }

    override fun run() {
        println("启动cpu")
    }
}