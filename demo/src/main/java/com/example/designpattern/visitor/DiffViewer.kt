package com.example.designpattern.visitor

/**
 * 收入支出分开查看处理
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 17:44
 */
abstract class DiffViewer :AccountViewer{

    abstract fun viewConsumeBill(bill: ConsumeBill)
    abstract fun viewIncomeBill(bill: IncomeBill)

    override fun view(bill: Bill){

    }
}