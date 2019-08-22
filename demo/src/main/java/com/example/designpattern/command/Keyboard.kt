package com.example.designpattern.command

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/13
 * @time 19:15
 */
class Keyboard {
    var command: Command? = null

    fun execute(){
        command?.doCommand()
    }
}