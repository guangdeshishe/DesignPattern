package com.example.designpattern.visitor

/**
 * 账单
 *
 * @author zhujie
 * @date 2019/6/5
 * @time 18:30
 */
abstract class Bill(amount : Double,remarks:String) : Element {
    val mAmount: Double = amount//金额
    val mRemarks: String = remarks//备注
}