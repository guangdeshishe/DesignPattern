package com.example.designpattern.iterator

/**
 * 迭代器接口
 *
 * @author zhujie
 * @date 2019/6/10
 * @time 16:37
 */
interface Iterator<E> {
    fun hasNext(): Boolean
    fun next(): E
}