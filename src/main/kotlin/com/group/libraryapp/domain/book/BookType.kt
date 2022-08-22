package com.group.libraryapp.domain.book

enum class BookType(private val score: Int) {
    COMPUTER(10),
    ECONOMY(8),
    SOCIETY(5),
    LANGUAGE(5),
    SCIENCE(5);

    fun getEventScore(): Int {
        return this.score
    }
}