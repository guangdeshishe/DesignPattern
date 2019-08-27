package com.example.designpattern.combination

import com.example.designpattern.util.Tool

/**
 * 测试类
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 16:31
 */
fun main(args: Array<String>) {
    val dir = Folder("C盘")//创建文件夹
    dir.addFile("Programs")//添加文件夹
    dir.addFile("Hello.java")//添加文件
    val subDir = dir.getFile(0)//获取Programs文件夹
    subDir?.addFile("美女.jpg")//添加文件

    printDir(dir)
}
//打印日志
fun printDir(folder:Folder){
    print(folder.name+":[")
    for(file in folder.mFiles){
        if (file is Folder){
            printDir(file)
        } else {
            print("("+file.getFileName()+")")
        }
    }
    print("]")
}