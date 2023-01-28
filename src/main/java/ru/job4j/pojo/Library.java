package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book taskBook = new Book("Clean Code", 2);
        Book story = new Book("Mumu", 44);
        Book novel = new Book("Dubrovskiy", 224);
        Book roman = new Book("War and peace", 100500);
        Book[] books = new Book[4];
        books[0] = taskBook;
        books[1] = story;
        books[2] = novel;
        books[3] = roman;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("\"" + b.getName() + "\"" + " has " + b.getPageCount() + " pages");
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("\"" + b.getName() + "\"" + " has " + b.getPageCount() + " pages");
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if ("Clean Code".equals(b.getName())) {
                System.out.println("\"" + b.getName() + "\"" + " has " + b.getPageCount() + " pages");
            }
        }
    }
}
