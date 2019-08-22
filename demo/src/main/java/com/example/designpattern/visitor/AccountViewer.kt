package com.example.designpattern.visitor

/**
 * 账单查看者
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 16:37
 */
interface AccountViewer {
    fun view(bill: Bill)
}