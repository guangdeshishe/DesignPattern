package com.example.designpattern.decorator

/**
 * 给手机贴膜贴膜
 *
 * @author zhujie
 * @date 2019/8/22
 * @time 18:09
 */
class FilmDecorator(phone: Phone) : Decorator(phone) {
    override fun show() {
        addFilm()
        super.show()
    }

    fun addFilm(){
        print("贴了膜的 ")
    }
}