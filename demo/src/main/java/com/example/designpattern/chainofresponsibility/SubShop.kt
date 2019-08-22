package com.example.designpattern.chainofresponsibility

import com.example.designpattern.util.Tool

/**
 * 分店
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 11:36
 */
class SubShop(name: String, distance: Int) : Shop {
    private val mDistance = distance//距离
    private val mName = name//店名
    var mNextShop: Shop? = null

    override fun order(order: Order): Boolean {
        if (order.mDistance < mDistance) {//在配送范围
            Tool.print("[$mName] 可以配送！")
            return true
        }
        Tool.print("[$mName] 不在配送范围！")
        if (mNextShop != null) {
            return mNextShop!!.order(order)
        }
        return false
    }

}