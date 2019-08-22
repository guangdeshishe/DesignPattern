package com.example.designpattern.visitor

/**
 * 收入项目
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 16:43
 */
class IncomeBill(amount: Double, remarks: String) : Bill(amount,remarks) {

    override fun accept(visitor: AccountViewer) {
        if (visitor is DiffViewer){
            visitor.viewIncomeBill(this)
            return
        }
        visitor.view(this)
    }
}