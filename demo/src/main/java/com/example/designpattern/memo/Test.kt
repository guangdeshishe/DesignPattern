package com.example.designpattern.memo

import com.example.designpattern.util.Tool

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/12
 * @time 10:48
 */

fun main(args: Array<String>) {
    val hero = Hero()
    val memo = Memo()
    hero.showStatus()
    Tool.print("打Boss前存档")
    memo.saveBackup(hero.createBackup())
    Tool.print("开始与Boss交战")
    hero.mBlood = 50
    hero.mMagical = 50
    hero.showStatus()
    memo.saveBackup(hero.createBackup())
    hero.mBlood = 10
    hero.mMagical = 5
    Tool.print("战斗结束")
    hero.showStatus()
    Tool.print("结果不满意，恢复存档")
    hero.restoreBackup(memo.getLastBackup())
    hero.showStatus()
    Tool.print("结果不满意，恢复存档")
    hero.restoreBackup(memo.getBackup(0))
    hero.showStatus()

}