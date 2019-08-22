package com.example.designpattern.proxy

import com.example.designpattern.util.Tool

/**
 * 游戏玩家
 *
 * @author zhujie
 * @date 2019/6/17
 * @time 19:38
 */
class GamePlayer(val name: String) : IGame {
    override fun update() {
        Tool.print("$name 升级了")
    }

    override fun attack() {
        Tool.print(":$name 正在打怪")
    }

    override fun login( n:String) {
        Tool.print("登录成功: $name")
    }
}