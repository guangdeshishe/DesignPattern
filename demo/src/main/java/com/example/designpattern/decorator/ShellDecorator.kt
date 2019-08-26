package com.example.designpattern.decorator

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/8/22
 * @time 18:12
 */
class ShellDecorator(phone: Phone) : Decorator(phone) {
    override fun show() {
        addShell()
        super.show()
    }

    fun addShell(){
        print("戴了壳的 ")
    }
}