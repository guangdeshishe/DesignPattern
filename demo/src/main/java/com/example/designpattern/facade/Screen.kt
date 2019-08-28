package com.example.designpattern.facade

/**
 * 硬件：屏幕
 */
class Screen : Component {
    override fun stop() {
        println("关闭显示器")
    }

    override fun run() {
        println("启动显示器")
    }
}