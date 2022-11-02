package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Scanner in = new Scanner(System.in);
        String answer;

        do {
            showBookshelf(bookshelf);
            showMenu();
            answer = in.nextLine();
            switch(answer) {
                case "1" -> {
                    System.out.print("Введите название книги: ");
                    Book book = bookshelf.findBook(in.nextLine());
                    if (book != null) System.out.println(book);
                }
                case "2" -> {
                    System.out.print("Введите название книги в формате: <Автор> <Название> <Год выхода> ");
                    bookshelf.addBook(in.nextLine());
                }
                case "3" -> {
                    System.out.print("Введите название книги, которую хотите удалить:");
                    bookshelf.delBook(in.nextLine());
                }
                case "4" -> bookshelf.cleanBookshelf();
                case "5" -> {}
                default ->  System.out.println("Повторите выбор.");
            }
            if(!answer.equals("5")) pressEnter(in);
        } while(!answer.equals("5"));
    }

    public static void showBookshelf(Bookshelf bookshelf) {
        if(bookshelf.getBooksTotal() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nШкаф содержит книг: " + bookshelf.getBooksTotal() + ". Свободно полок: " +
                    bookshelf.getNumFreeShelves() + ".\n");
            int maxLenBookDetails = bookshelf.getMaxLenBookDetails();
            for (Book book : bookshelf.getBooks()) {
                System.out.println("|" + book.toString() +
                        " ".repeat(maxLenBookDetails - book.toString().length()) + "|");
                System.out.println("|" + "-".repeat(maxLenBookDetails) + "|");
            }
            if(bookshelf.getNumFreeShelves() !=0) System.out.println("|" + " ".repeat(maxLenBookDetails) + "|");
        }
    }

    public static void showMenu() {
        System.out.print("""
                            
                             1. Найти книгу
                             2. Добавить книгу
                             3. Удалить книгу
                             4. Очистить шкаф
                             5. Выйти из программы
                            
                         """);
        System.out.print("Введите номер команды: ");
    }

    private static void pressEnter(Scanner in) {
        String answer;

        do {
            System.out.print("Для продолжения работы нажмите Enter: ");
            answer = in.nextLine();
        } while(!answer.isBlank());
    }
}