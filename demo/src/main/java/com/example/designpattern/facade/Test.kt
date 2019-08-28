package com.example.designpattern.facade

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/8/28
 * @time 0:15
 */
fun main(args: Array<String>) {
    val computer = Computer()
    computer.start()//启动电脑
    println("===================")
    computer.stop()//关闭电脑
}