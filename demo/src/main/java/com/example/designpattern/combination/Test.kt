package com.example.designpattern.combination

import com.example.designpattern.util.Tool

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/6/6
 * @time 16:31
 */
fun main(args: Array<String>) {
    val dir = Folder("C盘")
    dir.addFile("Programs")
    dir.addFile("Hello.java")
    val subDir = dir.getFile(0) as Folder
    subDir.addFile("美女.jpg")

    printDir(dir)
}

fun printDir(folder:Folder){
    print(folder.name+":")
    for(file in folder.mFiles){
        if (file is Folder){
            printDir(file)
        } else {
            print(file.getFileName()+"-")
        }
    }
    println()
}