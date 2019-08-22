package com.example.designpattern.command

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/13
 * @time 19:50
 */
fun main(args: Array<String>) {
    val command = PressACommand()
    val keyboard = Keyboard()
    keyboard.command = command
    keyboard.execute()

    keyboard.command = PressBCommand()
    keyboard.execute()
}