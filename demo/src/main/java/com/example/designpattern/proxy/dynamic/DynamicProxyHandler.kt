package com.example.designpattern.proxy.dynamic

import com.example.designpattern.util.Tool

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/18
 * @time 10:27
 */
class DynamicProxyHandler internal constructor(private val mRealObject: Any) : InvocationHandler {

    @Throws(Throwable::class)
    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any? {
        Tool.print("执行方法前：")
        val result = method.invoke(mRealObject, *args)
        Tool.print("执行方法后")
        return if ("void" == method.genericReturnType.typeName) Unit else result
    }
}
