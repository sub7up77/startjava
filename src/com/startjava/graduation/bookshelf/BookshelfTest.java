package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  answer;

        do {
            showMenu();
            answer = in.nextLine();
            switch(answer) {
                case "1" -> {
                    System.out.println("Введите название книги: ");
                    System.out.println(Bookshelf.findBook(in.nextLine()));
                }
                case "2" -> {
                        System.out.println("Введите название книги в формате: <Автор> <Название> <Год выхода> ");
                        System.out.println(Bookshelf.addBook(in.nextLine()));
                }
                case "3" -> {
                    System.out.println("Введите название книги, которую хотите удалить:");
                    System.out.println(Bookshelf.delBook(in.nextLine()));
                }
                case "4" -> System.out.println(Bookshelf.cleanBookshelf());
                case "5" -> {}
                default ->  System.out.println("Повторите выбор.");
            }
            if(!answer.equals("5")) pressEnter(in);
        } while(!answer.equals("5"));
    }

    private static void showMenu() {
        if(Bookshelf.getBooksTotal() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nШкаф содержит книг: " + Bookshelf.getBooksTotal() + ". Свободно полок: " +
                    Bookshelf.getNumFreeShelves() + ".\n");
            int maxLenArrMember = 0;
            for (Book book : Bookshelf.getBooks()) {
                if(maxLenArrMember < book.toString().length()) maxLenArrMember = book.toString().length();
            }
            for (Book book : Bookshelf.getBooks()) {
                System.out.println("|" + book.toString() + " ".repeat(maxLenArrMember - book.toString().length()) + "|");
                System.out.println("|" + "-".repeat(maxLenArrMember) + "|");
            }
            if(Bookshelf.getNumFreeShelves() !=0) System.out.println("|" + " ".repeat(maxLenArrMember) + "|");
        }
        System.out.println("""
                            
                            1. Найти книгу
                            2. Добавить книгу
                            3. Удалить книгу
                            4. Очистить шкаф
                            5. Выйти из программы
                            """);
    }

    private static void pressEnter(Scanner in) {
        String answer;

        do {
            System.out.print("Для продолжения работы нажмите Enter: ");
            answer = in.nextLine();
        } while(!answer.isBlank());
    }
}