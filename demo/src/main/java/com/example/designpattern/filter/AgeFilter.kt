package com.example.designpattern.filter

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/8/28
 * @time 19:22
 */
class AgeFilter(private val minAge: Int, private val maxAge: Int) : IFilter {
    override fun filter(persons: ArrayList<Person>): ArrayList<Person> {
        val result = ArrayList<Person>()
        for (person: Person in persons) {
            if (person.age in minAge..maxAge) {
                result.add(person)
            }
        }
        return result
    }

}