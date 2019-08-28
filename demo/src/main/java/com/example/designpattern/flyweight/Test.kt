package com.example.designpattern.flyweight

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:30
 */
fun main(args: Array<String>) {
    val factory = PiecesFactory()
    var chessPieces = factory.getChessPieces(PiecesColor.WHITE)
    chessPieces.downPieces(1, 2)

    chessPieces = factory.getChessPieces(PiecesColor.BLACK)
    chessPieces.downPieces(7, 8)

    chessPieces = factory.getChessPieces(PiecesColor.WHITE)
    chessPieces.downPieces(3, 4)

    chessPieces = factory.getChessPieces(PiecesColor.BLACK)
    chessPieces.downPieces(9, 10)

    println("缓存的对象：${factory.mCachePieces}")
}