package com.example.designpattern.facade

/**
 * 硬件抽象类
 */
interface Component {
    fun run()//启动硬件
    fun stop()//关闭硬件
}