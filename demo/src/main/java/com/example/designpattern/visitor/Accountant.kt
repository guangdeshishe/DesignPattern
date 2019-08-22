package com.example.designpattern.visitor

/**
 * 会计师
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 17:32
 */
class Accountant : AccountViewer {

    override fun view(bill: Bill) {
        System.out.println("会计师正在检查各项开支：${bill.mRemarks} -> ${bill.mAmount} 结果：ok")
    }
}