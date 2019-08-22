package com.example.designpattern.status

import com.example.designpattern.util.Tool

/**
 * 正常移动状态
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 10:23
 */
class RunningStatus :RunStatus {
    override fun run(hero: Hero) {
        //正常移动中
        Tool.print("正常速度移动中")
    }
}