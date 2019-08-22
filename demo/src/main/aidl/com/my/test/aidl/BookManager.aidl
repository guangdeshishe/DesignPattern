// BookManager.aidl
package com.my.test.aidl;
import com.my.test.aidl.Book;
// Declare any non-default types here with import statements

interface BookManager {
    List<Book> getBookList();
    void addBook(inout Book book);
    void deleteBook(inout Book book);
}
