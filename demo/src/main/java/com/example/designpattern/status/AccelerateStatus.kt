package com.example.designpattern.status

import com.example.designpattern.util.Tool

/**
 * 加速状态
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 10:24
 */
class AccelerateStatus :RunStatus{
    override fun run(hero: Hero) {
        Tool.print("开始加速,持续3秒")
        Thread.sleep(3000)
        hero.mCurrentStatus = RunningStatus()//恢复正常速度
    }
}