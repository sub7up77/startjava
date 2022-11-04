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
                    Book book = bookshelf.find(in.nextLine());
                    if (book != null) System.out.println(book);
                }
                case "2" -> {
                    System.out.print("Введите название книги в формате: <Автор> <Название> <Год выхода> ");
                    try {
                        String[] bookDetails = in.nextLine().split(" ");
                        bookshelf.add(new Book(bookDetails[0], bookDetails[1], Integer.parseInt(bookDetails[2])));
                    } catch(Exception ex) {
                        System.out.println("Недопустимый формат.");
                    }
                }
                case "3" -> {
                    System.out.print("Введите название книги, которую хотите удалить:");
                    bookshelf.del(in.nextLine());
                }
                case "4" -> bookshelf.clearBookshelf();
                case "5" -> {}
                default ->  System.out.println("Повторите выбор.");
            }
            if(!answer.equals("5")) pressEnter(in);
        } while(!answer.equals("5"));
    }

    public static void showBookshelf(Bookshelf bookshelf) {
        if(bookshelf.getCountBooks() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nШкаф содержит книг: " + bookshelf.getCountBooks() + ". Свободно полок: " +
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