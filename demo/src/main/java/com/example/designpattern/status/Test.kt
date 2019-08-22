package com.example.designpattern.status

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 10:01
 */
fun main(args: Array<String>) {
    val hero = Hero()
    hero.start()
    Thread.sleep(5000)

    hero.mCurrentStatus = AccelerateStatus()

    Thread.sleep(5000)

    hero.mCurrentStatus = DecelerateStatus()

    Thread.sleep(5000)

    hero.stop()
}