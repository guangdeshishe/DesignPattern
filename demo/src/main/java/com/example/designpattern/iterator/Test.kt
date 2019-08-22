package com.example.designpattern.iterator

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/10
 * @time 16:51
 */
fun main(args: Array<String>) {
    val list = MyList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        print("${iterator.next()},")
    }
}