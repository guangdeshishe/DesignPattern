package com.example.designpattern.util

import java.text.SimpleDateFormat
import java.util.*

/**
 * 工具
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 10:20
 */
class Tool {
    companion object {
        @JvmStatic
        fun print(message: String) {
            System.out.println(getNow() + ":" + message)
        }

        fun getNow(): String {

            return SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Date())


        }
    }

}