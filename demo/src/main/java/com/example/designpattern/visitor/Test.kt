package com.example.designpattern.visitor


fun main(args: Array<String>) {
    val accountBook = AccountBook()
    accountBook.addBill(ConsumeBill(2800.0, "买电视柜"))
    accountBook.addBill(ConsumeBill(2800.0, "买茶几"))
    accountBook.addBill(IncomeBill(1000.0, "发工资"))
    accountBook.addBill(IncomeBill(1000.0, "加班费"))

    val boss = Boss()
    accountBook.show(boss)
    boss.showTotalAmount()//老板查看账本

    System.out.println("==========================================")
    val accountant = Accountant()
    accountBook.show(accountant)//会计师核查账单项
}

