package com.example.designpattern.visitor

/**
 * 账单项
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 16:35
 */
interface Element {
    fun accept(visitor: AccountViewer)
}