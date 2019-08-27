package com.example.designpattern.adapter

/**
 * 电压适配器-类适配器
 *
 * @author zhujie
 * @date 2019/8/27
 * @time 16:27
 */
class VoltageClassAdapter :HomeVoltage(),MobilePhoneVoltage{
    override fun getMobilePhoneVoltage(): Int {
        return getHomeVoltage()/44
    }
}