package com.example.designpattern.filter

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/8/28
 * @time 19:27
 */
class PersonFilterManager : IFilter {
    private val filters = ArrayList<IFilter>()
    fun addFilter(filter: IFilter) {
        filters.add(filter)
    }

    fun removeFilter(filter: IFilter) {
        filters.remove(filter)
    }

    override fun filter(persons: ArrayList<Person>): ArrayList<Person> {
        var result = persons
        for (filter: IFilter in filters) {
            result = filter.filter(result)
        }
        return result
    }
}