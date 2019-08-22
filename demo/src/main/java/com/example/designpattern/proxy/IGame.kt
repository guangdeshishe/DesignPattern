package com.example.designpattern.proxy

/**
 * 游戏
 *
 * @author zhujie
 * @date 2019/6/17
 * @time 19:36
 */
interface IGame {
    /**
     * 登录
     */
    fun login(n:String)

    /**
     * 攻击
     */
    fun attack()

    /**
     * 升级
     */
    fun update()
}