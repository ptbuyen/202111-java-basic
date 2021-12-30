package lab14;

import lab14.Book;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static List<Book> bookList = new ArrayList<>();
    public static String bookFilePath = System.getProperty("user.dir").concat("/book.txt");

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
                    case 3:
                        updateBook();
                        printMenu();
                        break;
                    case 4:
                        deleteBook();
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
        System.out.println("1. Add Book");
        System.out.println("2. Retrieve Book");
        System.out.println("3. Update Book");
        System.out.println("4. Delete Book");
        System.out.println("0. Exit!");
    }

    private static void addBook() {
        // Read book list from file
        bookList = DataFactory.readBookList(bookFilePath);

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

            // Save into file system
            DataFactory.saveBookList(bookList, bookFilePath);

            System.out.println("Successfully added!");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Year must be a number! Please input again.");
            addBook();
        }
    }

    private static void retrieveBook() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book title to find: ");
        String toFindTitle = scanner.nextLine();

        // Read book list from file
        bookList = DataFactory.readBookList(bookFilePath);

        // Find book
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

    private static void updateBook() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book ISBN to update: ");
        String toUpdateBookISBN = scanner.nextLine();

        // Read book list from file
        bookList = DataFactory.readBookList(bookFilePath);

        // Update book
        Book foundBook = foundBook(toUpdateBookISBN);
        if (foundBook.getISBN() != null) {
            System.out.println("Current information: " + foundBook);
            System.out.print("\tNew Title: ");
            String newTitle = scanner.nextLine();
            System.out.print("\tNew Author: ");
            String newAuthor = scanner.nextLine();
            System.out.print("\tNew Year: ");
            int newYear = scanner.nextInt();

            for (int index = 0; index < bookList.size(); index++) {
                if (bookList.get(index).getISBN().equals(toUpdateBookISBN)){
                    bookList.get(index).setTitle(newTitle);
                    bookList.get(index).setAuthorName(newAuthor);
                    bookList.get(index).setYear(newYear);
                }
            }

            DataFactory.saveBookList(bookList, bookFilePath);
            System.out.println("Updated successfully!");
            System.out.println();
        } else {
            System.out.println("No book found with ISBN: " + toUpdateBookISBN);
            System.out.println();
        }
    }

    private static void deleteBook() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book ISBN to delete: ");
        String toUpdateBookISBN = scanner.nextLine();

        // Read book list from file
        bookList = DataFactory.readBookList(bookFilePath);

        // Delete book
        Book foundBook = foundBook(toUpdateBookISBN);
        if (foundBook.getISBN() != null) {
            for (int index = 0; index < bookList.size(); index++) {
                if (bookList.get(index).getISBN().equals(toUpdateBookISBN)){
                    bookList.remove(index);
                    break;
                }
            }

            DataFactory.saveBookList(bookList, bookFilePath);
            System.out.println("Delete successfully!");
            System.out.println();
        } else {
            System.out.println("No book found with ISBN: " + toUpdateBookISBN);
            System.out.println();
        }
    }

    private static Book foundBook(String toUpdateBookISBN) {
        for (Book bookItem : bookList) {
            if (bookItem.getISBN().equals(toUpdateBookISBN)) {
                return bookItem;
            }
        }
        return new Book();
    }
}
