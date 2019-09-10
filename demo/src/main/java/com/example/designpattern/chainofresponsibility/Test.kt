package com.example.designpattern.chainofresponsibility

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 11:41
 */
fun main(args: Array<String>) {
    val shopManager = ShopManager()
    val distance = 55//下单位置
    shopManager.order(Order(distance))
}