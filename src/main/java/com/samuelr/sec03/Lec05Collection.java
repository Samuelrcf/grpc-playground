package com.samuelr.sec03;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec03.Book;
import com.samuelr.models.sec03.Library;

public class Lec05Collection {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec03PerformanceTest.class);

	public static void main(String[] args) {
		var book1 = Book.newBuilder()
				.setTitle("Hayy Potter - Part 1")
				.setAuthor("J K Rowling")
				.setPublicationYear(1997)
				.build();

		var book2 = book1.toBuilder()
				.setTitle("Hayy Potter - Part 2")
				.setPublicationYear(1998)
				.build();
		
		var book3 = book1.toBuilder()
				.setTitle("Hayy Potter - Part 3")
				.setPublicationYear(1999)
				.build();
		
		var library = Library.newBuilder()
				.setName("Fantasy library")
//				.addBooks(book1)
//				.addBooks(book2)
//				.addBooks(book3)
				.addAllBooks(List.of(book1, book2, book3))
				.build();
				
		LOGGER.info("{}", library);
	}

}
