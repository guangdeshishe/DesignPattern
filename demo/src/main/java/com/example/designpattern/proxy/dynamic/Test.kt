package com.example.designpattern.proxy.dynamic

import com.example.designpattern.proxy.GamePlayer
import com.example.designpattern.proxy.GamePlayerProxy
import com.example.designpattern.proxy.IGame

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/17
 * @time 19:42
 */
fun main(args: Array<String>) {
    val gamePlayer = GamePlayer("张三")
    val gamePlayerProxy = DynamicProxy.newProxyInstance(gamePlayer) as IGame
    gamePlayerProxy.login("11")
//    gamePlayerProxy.attack()
//    gamePlayerProxy.update()
}