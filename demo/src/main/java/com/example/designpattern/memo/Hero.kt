package com.example.designpattern.memo

import com.example.designpattern.util.Tool

/**
 * 英雄
 *
 * @author zhujie
 * @date 2019/6/10
 * @time 17:57
 */
class Hero {
    var mBlood = 100//血量
    var mMagical = 100//魔法值

    /**
     * 创建存档
     */
    fun createBackup(): BackupData {
        val backupData = BackupData()
        backupData.mBlood = mBlood
        backupData.mMagical = mMagical
        return backupData
    }

    fun restoreBackup(backupData: BackupData?) {
        if (backupData == null) {
            Tool.print("暂时没有存档")
            return
        }
        mBlood = backupData.mBlood
        mMagical = backupData.mMagical
        Tool.print("恢复存档成功")
    }

    fun showStatus() {
        Tool.print("当前血量：$mBlood,魔法值：$mMagical")
    }
}