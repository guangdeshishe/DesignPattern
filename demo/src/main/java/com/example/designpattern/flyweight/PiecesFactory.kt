package com.example.designpattern.flyweight

import android.util.SparseArray

/**
 * 棋子管理类
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:23
 */
class PiecesFactory {
    val mCachePieces = HashMap<Int,ChessPieces>()

    fun getChessPieces(type: Int): ChessPieces {
        var chessPieces: ChessPieces? = mCachePieces[type]
        if (chessPieces == null) {
            when (type) {
                PiecesType.BLACK -> {
                    chessPieces = BlackPieces()
                }
                PiecesType.WHITE -> {
                    chessPieces = WhitePieces()
                }
            }
        }
        return chessPieces!!
    }
}