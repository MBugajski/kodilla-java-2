package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1.0");
        library.getBooks().add(new Book("A", "B", LocalDate.of(2015, 1, 1)));
        library.getBooks().add(new Book("B", "C", LocalDate.of(2016, 1, 1)));
        library.getBooks().add(new Book("D", "E", LocalDate.of(2017, 1, 1)));
        library.getBooks().add(new Book("F", "G", LocalDate.of(2018, 1, 1)));

        Library clonedLibrary = null;
        try {
                clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
                deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("H", "I", LocalDate.of(2019, 1, 1)));

        //Then
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
        Assert.assertNotEquals(library.getBooks().size(), deepClonedLibrary.getBooks().size());
    }
}
