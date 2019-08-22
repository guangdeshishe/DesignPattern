package com.example.designpattern

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import com.my.test.aidl.Book
import com.my.test.aidl.BookManager
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), ServiceConnection {

    lateinit var bookManager :BookManager

    override fun onServiceDisconnected(name: ComponentName?) {
        Toast.makeText(this@MainActivity, "断开连接", Toast.LENGTH_SHORT).show()
        Log.d("aidl","断开连接")
    }

    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
        bookManager = BookManager.Stub.asInterface(service)
        Toast.makeText(this@MainActivity, "连接成功", Toast.LENGTH_SHORT).show()
        Log.d("aidl","连接成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mAddButton.setOnClickListener {
            val book = Book()
            book.name = mEdittext.text.toString()
            bookManager.addBook(book)
        }
        mDeleteButton.setOnClickListener{
            val book = Book()
            book.name = mEdittext.text.toString()
            bookManager.deleteBook(book)
        }

        mGetAllButton.setOnClickListener{
            val bookList = bookManager.bookList
            val stringBuilder = StringBuilder()
            for (book in bookList){
                stringBuilder.append(book.name)
                stringBuilder.append("\n")
            }
            mShowAllTextView.text = stringBuilder.toString()
        }

        val intent = Intent()
        intent.action = "com.my.test.aidl.BookService"
        intent.setPackage("com.example.designpattern")
        bindService(intent, this, Context.BIND_AUTO_CREATE)

    }

    override fun onDestroy() {
        super.onDestroy()
        unbindService(this)
    }
}
