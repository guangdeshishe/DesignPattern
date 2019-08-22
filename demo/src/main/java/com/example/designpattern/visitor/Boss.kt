package com.example.designpattern.visitor

/**
 * 老板
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 17:09
 */
class Boss : DiffViewer() {

    var mTotalConsumeAmount: Double = 0.0//总的支出
    var mTotalIncomeAmount: Double = 0.0//总的收入

    override fun viewIncomeBill(bill: IncomeBill) {
        mTotalIncomeAmount += bill.mAmount
        System.out.println("老板正在查看收入项：${bill.mRemarks} -> ${bill.mAmount}")
    }

    override fun viewConsumeBill(bill: ConsumeBill) {
        mTotalConsumeAmount += bill.mAmount
        System.out.println("老板正在查看支出项：${bill.mRemarks} -> ${bill.mAmount}")
    }

    /**
     * 展示总得消费和支出
     */
    fun showTotalAmount() {
        System.out.println("总的支出：$mTotalConsumeAmount")
        System.out.println("总的收入：$mTotalIncomeAmount")
    }

}