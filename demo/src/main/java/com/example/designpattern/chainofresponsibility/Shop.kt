package com.example.designpattern.chainofresponsibility

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 12:01
 */
interface Shop {
    fun order(order: Order):Boolean
}