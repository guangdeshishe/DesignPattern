package com.example.designpattern.adapter

/**
 * 电压适配器-对象适配器
 *
 * @author zhujie
 * @date 2019/8/27
 * @time 16:31
 */
class VoltageObjectAdapter(private val homeVoltage: HomeVoltage) :MobilePhoneVoltage{
    override fun getMobilePhoneVoltage(): Int {
        return homeVoltage.getHomeVoltage()/44
    }

}