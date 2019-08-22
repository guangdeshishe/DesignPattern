package com.example.designpattern.flyweight

import com.example.designpattern.util.Tool

/**
 * 白色棋子
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:21
 */
class WhitePieces : ChessPieces {
    override fun downPieces(point: Point) {
        Tool.print("白色棋子，落子位置：${point.x},${point.y}")
    }
}