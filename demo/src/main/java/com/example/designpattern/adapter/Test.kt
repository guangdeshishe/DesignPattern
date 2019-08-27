package com.example.designpattern.adapter

/**
 * 测试类
 *
 * @author zhujie
 * @date 2019/8/27
 * @time 16:34
 */
fun main(args: Array<String>) {
    val classAdapter = VoltageClassAdapter()//220v 类转换器
    var mobilePhoneValtage = classAdapter.getMobilePhoneVoltage()//手机所需要的5v电压
    println("类转换器 :$mobilePhoneValtage")

    val homeVoltage = HomeVoltage()//家庭用电220v
    val objectAdapter = VoltageObjectAdapter(homeVoltage)//对象转换器
    mobilePhoneValtage = objectAdapter.getMobilePhoneVoltage()//转换成手机所需要的5v电压
    println("对象转换器 :$mobilePhoneValtage")
}