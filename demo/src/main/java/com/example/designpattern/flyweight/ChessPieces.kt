package com.example.designpattern.flyweight

import com.example.designpattern.util.Tool

/**
 * 棋子
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:20
 */
class ChessPieces(private val color: String) {
    fun downPieces(x: Int, y: Int) {
        Tool.print("${color}棋子，落子位置：${x},${y}")
    }
}