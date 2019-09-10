package com.example.designpattern.chainofresponsibility

/**
 * 店铺
 */
abstract class Shop(name: String, distance: Int) {
    var mNextShop: Shop? = null //下一家分店
    protected val mDistance = distance//距离
    protected val mName = name//店名
    abstract fun order(order: Order): Boolean
}