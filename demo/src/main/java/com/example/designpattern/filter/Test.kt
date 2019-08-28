package com.example.designpattern.filter

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/8/28
 * @time 19:32
 */
fun main(args: Array<String>) {
    val persons = ArrayList<Person>()
    for (i: Int in 1..100) {
        val person = Person(i, i % 2)//1为男性、0为女性
        persons.add(person)
    }
    val filterManager = PersonFilterManager()
    filterManager.addFilter(AgeFilter(18, 25))//年龄过滤器
    filterManager.addFilter(SexFilter(1))//男性过滤器
    val result = filterManager.filter(persons)
    for (person: Person in result) {
        println("age:${person.age},sex:${if (person.sex == 1) {
            '男'
        } else {
            '女'
        }}")
    }
}