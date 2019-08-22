package com.example.designpattern

import android.content.Context
import android.text.InputType
import android.text.method.DigitsKeyListener
import android.text.method.NumberKeyListener
import android.util.AttributeSet
import android.widget.EditText
import java.util.*

/**
 * 金额输入框
 * 1、只允许输入数字
 * 2、保留两位小数
 * 3、第一个数字如果是0，则后面只能输入.(也就是不能输入0123.45这样的)
 *
 * @author zhujie
 * @date 2019/6/24
 * @time 15:40
 */
class MoneyEditText(context: Context, attrs: AttributeSet?) : EditText(context, attrs) {
    constructor(context: Context) : this(context, null)

    init {
        filters = arrayOf(MoneyInputFilter())
//        inputType = (InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL)


        keyListener = DigitsKeyListener.getInstance(true, true)
    }


    class MoneyKeyListener : NumberKeyListener() {
        override fun getInputType(): Int {
            return InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL
        }

        override fun getAcceptedChars(): CharArray {
            return "123456789.".toCharArray()
        }

    }

}