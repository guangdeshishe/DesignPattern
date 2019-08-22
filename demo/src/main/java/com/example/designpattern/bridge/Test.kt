package com.example.designpattern.bridge

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/12
 * @time 16:59
 */
fun main(args: Array<String>) {
    val circle = Circle()
    circle.dwaw()
    circle.color = BlueColor()
    circle.dwaw()
    circle.color = ReadColor()
    circle.dwaw()
    println("================================")
    val square = Square()
    square.dwaw()
    square.color = BlueColor()
    square.dwaw()
    square.color = ReadColor()
    square.dwaw()
}