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
    private var mStartShop: Shop? = null//链首
    private lateinit var mEndShop: Shop//链尾

    init {
        Tool.print("初始化分店数据")
        val subShop1 = KfcShop("KFC分店1", 20)//分店1
        val subShop2 = KfcShop("KFC分店2", 30)//分店2
        val subShop3 = KfcShop("KFC分店3", 40)//分店3
        val subShop4 = KfcShop("KFC分店4", 50)//分店4
        val subShop5 = KfcShop("KFC分店5", 60)//分店5
        addShop(subShop1)
        addShop(subShop2)
        addShop(subShop3)
        addShop(subShop4)
        addShop(subShop5)
    }

    /**
     * 添加一个分店
     */
    fun addShop(shop: KfcShop) {
        if (mStartShop == null) {
            mStartShop = shop
            mEndShop = shop
        } else {
            mEndShop.mNextShop = shop
            mEndShop = shop
        }
    }

    /**
     * 开始下单
     */
    fun order(order: Order): Boolean {
        if (mStartShop == null) {
            return false
        }
        return mStartShop!!.order(order)
    }
}