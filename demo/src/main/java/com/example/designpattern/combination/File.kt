package com.example.designpattern.combination

import com.example.designpattern.util.Tool
import java.lang.RuntimeException

/**
 * 文件类
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 16:23
 */
 class File(val name:String) :IFile {
    override fun getFileName(): String {
        return name
    }


    override fun getFile(index: Int): IFile? {
        throw RuntimeException("不支持的操作")
    }

    override fun addFile(fileName: String) {
        throw RuntimeException("不支持的操作")
    }

    override fun copy() {
        Tool.print("[$name]复制成功")
    }

    override fun delete() {
        Tool.print("[$name]删除成功")
    }
}