package com.mishbah.books;

import com.mishbah.books.domain.Book;
import com.mishbah.books.domain.BookEntity;

public final class TestData {
    
    private TestData() {

    }

    public static Book testBook() {
        return Book.builder()
        .isbn("02345678")
        .author("Virgiana Woolf")
        .title("The Waves")
        .build();
    }

    public static BookEntity testBookEntity() {
        return BookEntity.builder()
        .isbn("02345678")
        .author("Virgiana Woolf")
        .title("The Waves")
        .build();
    }

}
