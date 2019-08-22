package com.example.designpattern.status

import com.example.designpattern.util.Tool


/**
 * Dota里的英雄
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 9:24
 */
class Hero {

    private var mThread: Thread? = null
    var mCurrentStatus: RunStatus = RunningStatus()//当前状态

    /**
     * 开始
     */
    fun start() {
        Tool.print("开始移动")
        mThread = Thread(Runnable {
            while (!mThread?.isInterrupted!!) {
                mCurrentStatus.run(this)
                Thread.sleep(1000)
            }
        })
        mThread!!.start()
    }

    /**
     * 结束
     */
    fun stop() {
        Tool.print("结束移动")
        mThread?.interrupt()


    }


}