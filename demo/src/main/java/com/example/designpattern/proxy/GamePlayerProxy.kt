package com.example.designpattern.proxy

import com.example.designpattern.util.Tool

/**
 * 代理游戏升级
 *
 * @author zhujie
 * @date 2019/6/17
 * @time 19:40
 */
class GamePlayerProxy(private val realGagePlayer: GamePlayer) : IGame {

    override fun login( n:String) {
        realGagePlayer.login(n)
    }

    override fun attack() {
        realGagePlayer.attack()
    }

    override fun update() {
        realGagePlayer.update()
    }
}