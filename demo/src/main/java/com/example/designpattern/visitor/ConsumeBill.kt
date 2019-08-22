package com.example.designpattern.visitor

/**
 * 消费项目
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 16:39
 */
class ConsumeBill(amount : Double,remarks:String) : Bill(amount,remarks) {
    override fun accept(visitor: AccountViewer) {
        if (visitor is DiffViewer){
            visitor.viewConsumeBill(this)
            return
        }
        visitor.view(this)
    }

}