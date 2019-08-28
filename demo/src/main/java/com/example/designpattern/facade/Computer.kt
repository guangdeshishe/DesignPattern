package com.example.designpattern.facade

/**
 * 电脑-外观类
 */
class Computer : IComputer {
    private val cup = Cpu()
    private val storage = Storage()
    private val screen = Screen()
    override fun start() {
        cup.run()
        storage.run()
        screen.run()
        println("》》电脑启动成功")
    }

    override fun stop() {
        cup.stop()
        storage.stop()
        screen.stop()
        println("》》电脑关闭成功")
    }
}