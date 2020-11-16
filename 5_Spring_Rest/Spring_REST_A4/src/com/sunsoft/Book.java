package com.sunsoft;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	
	public Book(int id, String name, String author, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}
}
