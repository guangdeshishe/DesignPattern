package com.my.test.aidl

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/7/11
 * @time 11:49
 */
class BookService : Service() {

    val bookDatas = ArrayList<Book>()

    inner class BookManagerStub : BookManager.Stub() {
        override fun getBookList(): MutableList<Book> {
            return bookDatas
        }

        override fun addBook(book: Book?) {
            if (book == null){
                return
            }
            if (book.name.isNullOrEmpty()) {
                Toast.makeText(this@BookService, "请输入要添加的书", Toast.LENGTH_SHORT).show()
                return
            }
            book.let { bookDatas.add(it) }
            Toast.makeText(this@BookService, "添加成功", Toast.LENGTH_SHORT).show()
        }

        override fun deleteBook(book: Book?) {
            if (book == null){
                return
            }
            if (book.name.isNullOrEmpty()) {
                Toast.makeText(this@BookService, "请输入要删除的书名", Toast.LENGTH_SHORT).show()
                return
            }
            for (tmp in bookDatas) {
                if (tmp.name == book.name) {
                    bookDatas.remove(tmp)
                    break
                }
            }
            Toast.makeText(this@BookService, "删除成功", Toast.LENGTH_SHORT).show()
        }

    }

    val bookManager = BookManagerStub()

    override fun onBind(intent: Intent?): IBinder? {
        return bookManager
    }

}