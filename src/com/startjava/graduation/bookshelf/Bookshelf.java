package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static final int SHELVES_LIMIT = 10;
    private final Book[] books;
    private int countBooks;
    private int maxLenBookDetails;

    public Bookshelf() {
        books = new Book[SHELVES_LIMIT];
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getMaxLenBookDetails() {
        return maxLenBookDetails;
    }

    public Book find(String title) {
        int index = getBookIndex(title);
        if(index != -1) return new Book(books[index].getAuthor(), books[index].getTitle(), books[index].getPublishYear());
        return null;
    }

    public void add(Book book) {
        if(countBooks == SHELVES_LIMIT) {
            System.out.println("Невозможно добавить книгу. Шкаф заполнен.");
            return;
        }
        if(book.getAuthor().isBlank()) {
            System.out.println("Вы не ввели автора книги.");
            return;
        }
        if(book.getTitle().isBlank()) {
            System.out.println("Вы не ввели название книги.");
            return;
        }
        if(book.getPublishYear() <= 0) {
            System.out.println("Некорректная дата выхода книги.");
            return;
        }
        books[countBooks] = book;
        countBooks++;
        int len = book.toString().length();
        if(len > maxLenBookDetails)  maxLenBookDetails = len;
        System.out.println("Книга добавлена.");
    }

    public void del(String title) {
        int index = getBookIndex(title);
        if(index != -1) {
            int len = books[index].toString().length();
            if (index == countBooks - 1) {
                books[index] = null;
            } else {
                System.arraycopy(books, index + 1, books, index, countBooks - 1 - index);
                books[countBooks - 1] = null;
            }
            countBooks--;
            if (len == maxLenBookDetails) setMaxLenBookDetails();
            System.out.println("Книга удалена.");
        }
    }

    public void clearBookshelf() {
        if(countBooks == 0) {
            System.out.println("Шкаф пуст.");
            return;
        }
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        maxLenBookDetails = 0;
        System.out.println("Шкаф очищен.");
    }

    public int getNumFreeShelves() {
        return SHELVES_LIMIT - countBooks;
    }

    private int getBookIndex(String title) {
        if(countBooks == 0) {
            System.out.println("Шкаф пуст.");
            return -1;
        }
        if(title.isBlank()) {
            System.out.println("Вы не ввели название книги.");
            return -1;
        }
        for (int i = 0; i < countBooks; i++) {
            if(title.equals(books[i].getTitle())) {
                return i;
            }
        }
        System.out.println("Книга не найдена.");
        return -1;
    }

    private void setMaxLenBookDetails() {
        if(countBooks == 0) {
            maxLenBookDetails = 0;
            return;
        }
        int maxLen = 0;
        for (int i = 0; i < countBooks ; i++) {
            int len = books[i].toString().length();
            if(len > maxLen) maxLen = len;
        }
        maxLenBookDetails = maxLen;
    }
}