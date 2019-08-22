package com.example.designpattern.decorator

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 19:30
 */
fun main(args: Array<String>) {
    val xiaoMiPhone = XiaoMiPhone()//小米手机
    val huaWeiPhone = HuaWeiPhone()//华为手机
    val filmDecorator = FilmDecorator(xiaoMiPhone)//贴了膜的小米手机
    val shellDecorator = ShellDecorator(huaWeiPhone)//戴了壳的华为手机
    filmDecorator.show()
    shellDecorator.show()
}