package com.example.designpattern.combination

/**
 * 文件接口
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 16:16
 */
interface IFile {
    fun delete()
    fun copy()

    //文件夹拥有的
    fun addFile(fileName: String)
    fun getFile(index: Int): IFile?

    fun getFileName():String
}