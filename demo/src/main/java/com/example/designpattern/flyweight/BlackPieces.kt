package com.example.designpattern.flyweight

import com.example.designpattern.util.Tool

/**
 * 黑色棋子
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:20
 */
class BlackPieces : ChessPieces {
    override fun downPieces(point: Point) {
        Tool.print("黑色棋子，落子位置：${point.x},${point.y}")
    }
}