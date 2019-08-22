package com.example.designpattern.decorator

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/8/22
 * @time 18:07
 */
abstract class Decorator(var phone:Phone) : Phone {
    override fun show() {
        phone.show()
    }
}