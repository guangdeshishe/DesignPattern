package com.example.designpattern.flyweight

/**
 * 棋子管理类
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:23
 */
class PiecesFactory {
    val mCachePieces = HashMap<String, ChessPieces>()

    fun getChessPieces(color: String): ChessPieces {
        var chessPieces = mCachePieces[color]
        if (chessPieces == null) {
            chessPieces = ChessPieces(color)
            mCachePieces[color] = chessPieces
        }
        return chessPieces
    }
}