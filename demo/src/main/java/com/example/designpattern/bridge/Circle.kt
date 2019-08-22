package com.example.designpattern.bridge

import com.example.designpattern.util.Tool

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/12
 * @time 16:55
 */
class Circle : Shape() {
    override fun dwaw() {
        if (color != null) {
            Tool.print("绘制圆形,颜色：" + color!!.getColor())
            return
        }
        Tool.print("绘制圆形")
    }
}