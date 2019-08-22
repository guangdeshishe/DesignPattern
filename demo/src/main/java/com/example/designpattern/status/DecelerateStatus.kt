package com.example.designpattern.status

import com.example.designpattern.util.Tool

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 10:26
 */
class DecelerateStatus :RunStatus {
    override fun run(hero: Hero) {
        Tool.print("开始减速,持续3秒")
        Thread.sleep(3000)
        hero.mCurrentStatus = RunningStatus()//恢复正常速度
    }
}