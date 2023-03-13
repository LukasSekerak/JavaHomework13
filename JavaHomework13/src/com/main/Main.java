package com.main;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
//	    Using Java Stream API find out sum of all numbers between 1 and 10000 that are dividable by both 3 and 5 but not dividable by 7 
		
		System.out.println(Stream.iterate(1, x -> x + 1)
				.limit(10000)
				.filter(x -> x % 3 == 0 && x % 5 == 0 && x % 7 != 0)
				.count());
		
//	    Using Java Stream API print first 100 even numbers that are not dividable by 8
		Stream.iterate(1, x -> x + 1)
		.filter(x -> x % 8 != 0)
		.limit(100)
		.forEach(A -> System.out.println(A));

		
		
//		and we have Stream<Book> list containing number of books.
//		 
//
//		3.1 Using Java Stream API print names (in alphabetic order) of all books that have price smaller than 100.
//
//		3.2 Using Java stream API find out how many books have name shorter than 5 characters.
//
//		3.3 Using Java stream API find out what is the average price of the book in the list
//
//		3.4 Using Java stream API find out if all books in list are cheaper than 500

	}

}
