package lab14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static void saveBookList(List<Book> bookList, String path) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : bookList) {
                // 1234;title;teo;2021
                String bookData = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthorName() + ";" + book.getYear();
                bufferedWriter.write(bookData);
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // IO try catch
        // Close resources

        // Try with resources
    }

    public static List<Book> readBookList(String filePath) {
        // Check if filePath is not exist, create
        File newFilePath = new File(filePath);
        try {
            newFilePath.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Book> bookList = new ArrayList<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(newFilePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null){
                String[] bookData = dataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String authorName = bookData[2];
                int year = Integer.parseInt(bookData[3]);

                Book book = new Book(ISBN, title, authorName, year);
                bookList.add(book);

                dataLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bookList;
    }
}
