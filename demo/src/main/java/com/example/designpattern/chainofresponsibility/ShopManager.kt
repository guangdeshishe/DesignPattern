package com.example.designpattern.chainofresponsibility

import com.example.designpattern.util.Tool

/**
 * 店铺管理
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 12:25
 */
class ShopManager {
    private var mStartShop: SubShop? = null
    private var mEndShop: SubShop? = null

    init {
        Tool.print("init")
        val subShop1 = SubShop("分店1", 20)//分店1
        val subShop2 = SubShop("分店2", 30)//分店2
        val subShop3 = SubShop("分店3", 40)//分店3
        val subShop4 = SubShop("分店4", 50)//分店4
        val subShop5 = SubShop("分店5", 60)//分店5
        addShop(subShop1)
        addShop(subShop2)
        addShop(subShop3)
        addShop(subShop4)
        addShop(subShop5)
    }

    fun addShop(shop: SubShop) {
        if (mStartShop == null) {
            mStartShop = shop
            mEndShop = shop
        } else {
            mEndShop!!.mNextShop = shop
            mEndShop = shop
        }
    }

    fun order(order: Order): Boolean {
        if (mStartShop == null) {
            return false
        }
        return mStartShop!!.order(order)
    }
}