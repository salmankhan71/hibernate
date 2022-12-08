package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBookObjectExample {
	public static void main(String[] args) {
		List<BookOfList> bookDetails = getElements();
		for (BookOfList bookDetail : bookDetails) {
			System.out.println(bookDetail);
		}
	}

	private static List<BookOfList> getElements() {
		List<BookOfList> bookOfLists = new ArrayList<>();

		BookOfList bookOfList = new BookOfList();
		bookOfList.setBookId(1);
		bookOfList.setBookName("Java");
		bookOfList.setAuthor("Games Goslin");

		bookOfLists.add(bookOfList); 
		//bookOfLists.add(new BookOfList());
		// ignore the spelling
		return bookOfLists;
	}

}
