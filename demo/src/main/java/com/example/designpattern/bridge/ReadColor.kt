package com.example.designpattern.bridge

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/12
 * @time 16:52
 */
class ReadColor :IColor {
    override fun getColor(): String {
        return "红色"
    }
}