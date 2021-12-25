package lab13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        // Print menu
        printMenu();

        // Check Option
        boolean isContinuing = true;
        int failTime = 0;

        while (isContinuing) {
            try {
                if (failTime == 3) {
                    System.out.println("Exceed try times!");
                    break;
                }

                Scanner scanner = new Scanner(System.in);
                System.out.print("Your option: ");
                int userInput = scanner.nextInt();

                switch (userInput) {
                    case 1:
                        addBook();
                        printMenu();
                        break;
                    case 2:
                        retrieveBook();
                        printMenu();
                        break;
                    case 0:
                        isContinuing = false;
                        break;
                    default:
                        failTime++;
                        break;
                }
            } catch (Exception e) {
                failTime++;
            }
        }
        System.out.println("Good bye. Have a nice day!");
    }

    private static void printMenu() {
        System.out.println("=========Book Management=============");
        System.out.println("1. Add book");
        System.out.println("2. Retrieve Book");
        System.out.println("0. Exit !");
    }

    private static void addBook() {
        // Input
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author name: ");
        String authorName = scanner.nextLine();
        System.out.print("Year: ");
        try {
            int year = Integer.parseInt(scanner.nextLine());
            // Save
            Book book = new Book(ISBN, title, authorName, year);
            bookList.add(book);
            System.out.println("Successfully added!");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Year must be a number! Please input again.");
            addBook();
        }
    }

    private static void retrieveBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book title to find: ");
        String toFindTitle = scanner.nextLine();
        List<Book> foundBookList = new ArrayList<>();

        for (Book bookItem : bookList) {
            if (bookItem.getTitle().contains(toFindTitle)) {
                foundBookList.add(bookItem);
            }
        }

        if (foundBookList.size() == 0) {
            System.out.println("There is no book with title: " + toFindTitle);
        } else if (toFindTitle.hashCode() == 0) {
            System.out.println("All of the books: ");
            for (Book bookItem : foundBookList)
                System.out.println("\t- " + bookItem);
        } else {
            System.out.println("The book(s) is: ");
            for (Book bookItem : foundBookList)
                System.out.println("\t- " + bookItem);
        }
        System.out.println();
    }
}
