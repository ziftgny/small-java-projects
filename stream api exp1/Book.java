package project;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Book {
	private String name;
	private int pageNum;
	private String author;
	private String date;
	public Book(String name, int pageNum, String author, String date) {
		super();
		this.name = name;
		this.pageNum = pageNum;
		this.author = author;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public int getPageNum() {
		return pageNum;
	}
	public String getAuthor() {
		return author;
	}
	public String getDate() {
		return date;
	}
	
	
}
