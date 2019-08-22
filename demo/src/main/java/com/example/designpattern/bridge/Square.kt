package com.example.designpattern.bridge

import com.example.designpattern.util.Tool

/**
 * 正方形
 *
 * @author zhujie
 * @date 2019/6/12
 * @time 17:02
 */
class Square :Shape(){
    override fun dwaw() {
        if (color != null) {
            Tool.print("绘制方形,颜色：" + color!!.getColor())
            return
        }
        Tool.print("绘制方形")
    }
}