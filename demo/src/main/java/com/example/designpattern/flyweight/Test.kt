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
    var chessPieces = factory.getChessPieces(PiecesType.WHITE)
    chessPieces.downPieces(Point(1, 2))

    chessPieces = factory.getChessPieces(PiecesType.BLACK)
    chessPieces.downPieces(Point(7, 8))

    chessPieces = factory.getChessPieces(PiecesType.WHITE)
    chessPieces.downPieces(Point(3, 4))

    chessPieces = factory.getChessPieces(PiecesType.BLACK)
    chessPieces.downPieces(Point(9, 10))


}