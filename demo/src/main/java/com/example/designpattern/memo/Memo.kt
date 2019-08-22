package com.example.designpattern.memo

import com.example.designpattern.util.Tool

/**
 *备忘录
 *
 * @author zhujie
 * @date 2019/6/12
 * @time 10:42
 */
class Memo {
    private val mBackupDatas = ArrayList<BackupData>()

    /**
     * 保存备份
     */
    fun saveBackup(backupData: BackupData) {

        mBackupDatas.add(backupData)
        Tool.print("存档成功")
    }

    fun getLastBackup(): BackupData? {
        if (mBackupDatas.isEmpty()) {
            return null
        }
        return mBackupDatas.last()
    }


    fun getBackup(index: Int): BackupData? {
        if (mBackupDatas.isEmpty() || index < 0 || index > mBackupDatas.size) {
            return null
        }
        return mBackupDatas[index]
    }
}