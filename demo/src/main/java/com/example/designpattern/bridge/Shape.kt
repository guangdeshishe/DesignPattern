package com.example.designpattern.bridge

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/12
 * @time 16:53
 */
abstract class Shape() {
    var color: IColor? = null
    abstract fun dwaw()
}