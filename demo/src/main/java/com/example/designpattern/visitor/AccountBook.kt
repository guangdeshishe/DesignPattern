package com.example.designpattern.visitor

/**
 * 账簿
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 16:45
 */
class AccountBook {
    private val mBills: MutableList<Element> = ArrayList()//账单项目

    /**
     * 添加账单项
     */
    fun addBill(bill: Element) {
        mBills.add(bill)
    }

    /**
     * 访问账单项
     */
    fun show(viewer: AccountViewer) {
        for (bill: Element in mBills) {
            bill.accept(viewer)
        }
    }

}