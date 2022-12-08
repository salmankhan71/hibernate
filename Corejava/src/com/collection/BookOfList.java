package com.collection;

public class BookOfList {
	private int BookId;
	private String BookName;
	private String Author;

	
	  public BookOfList() { super();
	 
	  }
	 

	public BookOfList(int bookId, String bookName, String author) {
		super();
		this.BookId = bookId;
		this.BookName = bookName;
		this.Author = author;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	@Override
	public String toString() {
		return "BookOfList [BookId=" + BookId + ", BookName=" + BookName + ", Author=" + Author + "]";
	}

}
