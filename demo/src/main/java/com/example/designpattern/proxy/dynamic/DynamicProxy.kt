package com.example.designpattern.proxy.dynamic

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/17
 * @time 19:49
 */
class DynamicProxy {
    companion object {
        fun newProxyInstance(realObject: Any): Any {
            return Proxy.newProxyInstance(
                realObject.javaClass.classLoader,
                realObject.javaClass.interfaces,
                DynamicProxyHandler(realObject)
            )
        }
    }
}