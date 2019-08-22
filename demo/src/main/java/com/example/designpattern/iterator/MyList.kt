package com.example.designpattern.iterator

/**
 * 自定义List
 *
 * @author zhujie
 * @date 2019/6/10
 * @time 16:40
 */
class MyList<E> : Iterable<E> {

    private val mDatas = ArrayList<E>()

    fun add(data: E) {
        mDatas.add(data)
    }

    fun size(): Int {
        return mDatas.size
    }

    override fun iterator(): Iterator<E> {
        return Itr()
    }

    private inner class Itr : Iterator<E> {
        var index = 0

        override fun next(): E {
            val data: E = mDatas[index]
            index++
            return data
        }

        override fun hasNext(): Boolean {
            return index >= 0 && index < mDatas.size
        }

    }
}