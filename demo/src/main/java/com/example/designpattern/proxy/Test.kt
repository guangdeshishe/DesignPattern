package com.example.designpattern.proxy

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/17
 * @time 19:42
 */
fun main(args: Array<String>) {
    val gamePlayerProxy = GamePlayerProxy(GamePlayer("张三"))
    gamePlayerProxy.login("")
    gamePlayerProxy.attack()
    gamePlayerProxy.update()
}