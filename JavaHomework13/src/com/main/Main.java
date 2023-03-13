package com.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
//	    Using Java Stream API find out sum of all numbers between 1 and 10000 that are dividable by both 3 and 5 but not dividable by 7 
		System.out.println("Count numbers: "+Stream.iterate(1, x -> x + 1)
				.limit(10000)
				.filter(x -> x % 3 == 0 && x % 5 == 0 && x % 7 != 0)
				.count());
		
//	    Using Java Stream API print first 100 even numbers that are not dividable by 8
		System.out.print("Numbers: ");
		Stream.iterate(1, x -> x + 1)
		.filter(x -> x % 8 != 0)
		.limit(100)
		.forEach(A -> System.out.print(A + ", "));
		
//		And we have Stream<Book> list containing number of books.
		List<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(new Book("Harry Potter 1", 100));
		listOfBooks.add(new Book("Lord of the Rings 1", 150));
		listOfBooks.add(new Book("Robinson Crusoe", 50));
		listOfBooks.add(new Book("Tarzan", 75));
		listOfBooks.add(new Book("Pat a Mat", 120));
		listOfBooks.add(new Book("Danka a Janka", 36));
		listOfBooks.add(new Book("Z rozprávky do rozprávky", 45));
		listOfBooks.add(new Book("Kniha džunglí", 110));
				
//		3.1 Using Java Stream API print names (in alphabetic order) of all books that have price smaller than 100.
		Stream<Book> streamOfBooks1 = listOfBooks.stream();
		System.out.println("\n\nAll books that have price smaller than 100 are: ");
		streamOfBooks1
			.filter(x -> x.getPrice() < 100)
			.sorted(Comparator.comparing(Book::getName))
			.forEach(b -> System.out.println(b.getName()));
		
//		3.2 Using Java stream API find out how many books have name shorter than 5 characters.
		Stream<Book> streamOfBooks2 = listOfBooks.stream();
		
		System.out.println("\nNumber of books' name shorter than 5: " + streamOfBooks2
		.filter(x -> x.getName().length() < 5)
		.count());
		
//		3.3 Using Java stream API find out what is the average price of the book in the list
		Stream<Book> streamOfBooks3 = listOfBooks.stream();
		
		System.out.println("\nAverage price of books: " + streamOfBooks3
				.mapToDouble(x -> x.getPrice())
				.average().getAsDouble()
		);
	
//		3.4 Using Java stream API find out if all books in list are cheaper than 500
		Stream<Book> streamOfBooks4 = listOfBooks.stream();
		
		System.out.println("\nAll books are cheeper than 500: " + streamOfBooks4
		.allMatch(x -> x.getPrice() < 500)
		);
	}

}
