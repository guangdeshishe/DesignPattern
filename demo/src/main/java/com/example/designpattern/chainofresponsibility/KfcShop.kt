package com.example.designpattern.chainofresponsibility

import com.example.designpattern.util.Tool

/**
 * 肯德基分店
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 11:36
 */
class KfcShop(name: String, distance: Int) : Shop(name, distance) {

    override fun order(order: Order): Boolean {
        if (order.distance < mDistance) {//在配送范围
            Tool.print("[$mName] 已接单！请耐心等待！")
            return true
        }
        Tool.print("[$mName] 不在配送范围！")
        if (mNextShop != null) {
            return mNextShop!!.order(order)
        } else {
            Tool.print("没找到可以配送的店")
        }
        return false
    }
}