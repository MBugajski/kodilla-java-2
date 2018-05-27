package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Answer

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultListOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthday().isBefore(LocalDate.now().minusYears(20)))
                .filter(user -> user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user-> user));

        System.out.println("# elements: " + theResultListOfUsers.size());
        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

//        People.getList().stream()
//                .filter(s -> s.length() > 11)
//                .map(String::toLowerCase)
//                .map(s -> s.toUpperCase())
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);
//
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

    }
}