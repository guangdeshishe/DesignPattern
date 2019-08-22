package com.example.designpattern.combination

import com.example.designpattern.util.Tool

/**
 * 文件夹
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 16:27
 */
class Folder(val name: String) :IFile{
    override fun getFileName(): String {
        return name
    }

    override fun copy() {
        Tool.print("[$name]复制成功")
    }

    val mFiles = ArrayList<IFile>()

    override fun getFile(index: Int): IFile? {
        if (index < 0 || index >= mFiles.size) {
            return null
        }
        return mFiles[index]
    }
    override fun addFile(fileName: String) {
        if (fileName.contains(".")) {
            //添加文件
            mFiles.add(File(fileName))
            return
        }
        //添加文件夹
        mFiles.add(Folder(fileName))
    }

    override fun delete() {
        for (file in mFiles) {
            file.delete()
        }

    }

}