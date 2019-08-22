package com.example.designpattern.iterator

/**
 * 支持迭代器模式
 *
 * @author zhujie
 * @date 2019/6/10
 * @time 16:38
 */
interface Iterable<E> {
    fun iterator():Iterator<E>
}