package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import static java.lang.Integer.parseInt;

public class Bookshelf {

    public static final int SHELVES_TOTAL = 10;
    private final Book[] books;
    private int booksTotal = 0;
    private int maxLenBookDetails = 0;

    public Bookshelf() {
        books = new Book[SHELVES_TOTAL];
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, booksTotal);
    }

    public int getBooksTotal() {
        return booksTotal;
    }

    public int getMaxLenBookDetails() {
        return maxLenBookDetails;
    }

    public Book findBook(String name) {
        if(booksTotal == 0) {
            System.out.println("Шкаф пуст.");
            return null;
        }
        if(name.isBlank()) {
            System.out.println("Вы не ввели название книги.");
            return null;
        }
        for (int i = 0; i <= booksTotal - 1; i++) {
            if(name.equals(books[i].getTitle())) {
                return new Book(books[i].getAuthor(), books[i].getTitle(), books[i].getPublishYear());
            }
        }
        System.out.println("Книга не найдена.");
        return null;
    }

    public void addBook(String textLine) {
        if(booksTotal == SHELVES_TOTAL) {
            System.out.println("Невозможно добавить книгу. Шкаф заполнен.");
            return;
        }
        if(textLine.isBlank()) {
            System.out.println("Вы не ввели название книги.");
            return;
        }
        try {
            String[] bookDetails = textLine.split(" ");
            books[booksTotal] = new Book(bookDetails[0], bookDetails[1], parseInt(bookDetails[2]));
            booksTotal++;
            updateMaxLenBookDetails(books[booksTotal-1].toString().length());
            System.out.println("Книга добавлена.");
        } catch(Exception ex) {
            System.out.println("Недопустимый формат.");
        }
    }

    public void delBook(String name) {
            if(booksTotal == 0) {
                System.out.println("Шкаф пуст.");
                return;
            }
            if(name.isBlank()) {
                System.out.println("Вы не ввели название книги.");
                return;
            }
        int index = booksTotal - 1;
        for (int i = 0; i <= index; i++) {
            if(name.equals(books[i].getTitle())) {
                int len = books[i].toString().length();
                if(i == index) {
                    books[i] = null;
                } else {
                    System.arraycopy(books, i + 1, books, i, index - i);
                    books[index] = null;
                }
                booksTotal--;
                if(len == maxLenBookDetails) setMaxLenBookDetails();
                System.out.println("Книга удалена.");
                return;
            }
        }
        System.out.println("Книга не найдена.");
    }

    public void cleanBookshelf() {
        if(booksTotal == 0) {
            System.out.println("Шкаф пуст.");
            return;
        }
        Arrays.fill(books,0,booksTotal - 1, null);
        booksTotal = 0;
        maxLenBookDetails = 0;
        System.out.println("Шкаф очищен.");
    }

    public int getNumFreeShelves() {
        return SHELVES_TOTAL - booksTotal;
    }

    private void setMaxLenBookDetails() {
        if(booksTotal == 0) {
            maxLenBookDetails = 0;
            return;
        }
        int maxLen = 0;
        for (int i = 0; i <= booksTotal - 1; i++) {
            int len = books[i].toString().length();
            if(maxLen < len) maxLen = len;
        }
        maxLenBookDetails = maxLen;
    }
    private void updateMaxLenBookDetails(int lenBookDetails) {
        if(maxLenBookDetails < lenBookDetails)  maxLenBookDetails = lenBookDetails;
    }
}