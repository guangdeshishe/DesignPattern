package com.example.designpattern.facade

/**
 * 硬件：硬盘
 */
class Storage : Component {
    override fun stop() {
        println("关闭硬盘")
    }

    override fun run() {
        println("启动硬盘")
    }
}