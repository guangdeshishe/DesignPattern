package com.my.test.aidl

import android.os.Parcel
import android.os.Parcelable

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/7/11
 * @time 11:49
 */
class Book() : Parcelable {
    var name: String? = null

    constructor(parcel: Parcel) : this() {
        name = parcel.readString()
    }

    fun readFromParcel(parcel: Parcel){
        name = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }

}