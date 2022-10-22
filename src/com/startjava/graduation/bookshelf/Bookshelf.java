package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import static java.lang.Integer.parseInt;

public class Bookshelf {

    public static final int SHELVES_TOTAL = 10;
    private static final Book[] books = new Book[SHELVES_TOTAL];
    private static int booksTotal = 0;

    public static String findBook(String name) {
        if(booksTotal == 0) return "Шкаф пуст.";
        if(name.isBlank()) return "Вы не ввели название книги.";
        for (int i = 0; i <= booksTotal - 1; i++) {
            if(name.equals(books[i].getTitle())) {
                return books[i].toString();
            }
        }
        return "Книга не найдена.";
    }

    public static String addBook(String textLine) {
        if(booksTotal == SHELVES_TOTAL) return "Невозможно добавить книгу. Шкаф заполнен.";
        if(textLine.isBlank()) return "Вы не ввели название книги.";
        try {
            String[] bookDetails = textLine.split(" ");
            books[booksTotal] = new Book(bookDetails[0], bookDetails[1], parseInt(bookDetails[2]));
            booksTotal++;
            return "Книга добавлена.";
        } catch(Exception ex) {
            return "Недопустимый формат.";
        }
    }

    public static String delBook(String name) {
        if(booksTotal == 0) return "Шкаф пуст.";
        if(name.isBlank()) return "Вы не ввели название книги.";
        int index = booksTotal - 1;
        for (int i = 0; i <= index; i++) {
            if(name.equals(books[i].getTitle())) {
                if(i == index) {
                    books[i] = null;
                } else {
                    System.arraycopy(books, i + 1, books, i, index - i);
                    books[index] = null;
                }
                booksTotal--;
                return "Книга удалена.";
            }
        }
        return "Книга не найдена.";
    }

    public static String cleanBookshelf() {
        if(booksTotal == 0) return "Шкаф пуст.";
        Arrays.fill(books,0,booksTotal - 1, null);
        booksTotal = 0;
        return "Шкаф очищен.";
    }

    public static int getBooksTotal() {
        return booksTotal;
    }

    public static int getNumFreeShelves() {
        return SHELVES_TOTAL - booksTotal;
    }

    public static Book[] getBooks() {
        return Arrays.copyOf(books, booksTotal);
    }
}
