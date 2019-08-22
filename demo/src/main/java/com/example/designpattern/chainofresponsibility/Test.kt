package com.example.designpattern.chainofresponsibility

import com.example.designpattern.util.Tool

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 11:41
 */
fun main(args: Array<String>) {


    val shopManager = ShopManager()

    val distance = 55
    val isOk = shopManager.order(Order(distance))

    if (!isOk) {
        Tool.print("没找到可以配送的店")
    }
}