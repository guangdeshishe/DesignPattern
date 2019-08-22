package com.example.designpattern.flyweight

/**
 * 定义棋子的功能
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:17
 */
interface ChessPieces {
    /**
     * 落子
     * @param point 落子坐标，外部状态信息
     */
    fun downPieces(point: Point)
}