package project;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class Main {
	public static void main(String[] args)   {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925-04-10"));
		books.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960-07-11"));
		books.add(new Book("1984", 328, "George Orwell", "1949-06-08"));
		books.add(new Book("Pride and Prejudice", 432, "Jane Austen", "1813-01-28"));
		books.add(new Book("The Catcher in the Rye", 224, "J.D. Salinger", "1951-07-16"));
		books.add(new Book("The Hobbit", 310, "J.R.R. Tolkien", "1937-09-21"));
		books.add(new Book("Brave New World", 311, "Aldous Huxley", "1932-06-01"));
		books.add(new Book("Moby-Dick", 625, "Herman Melville", "1851-10-18"));
		books.add(new Book("The Lord of the Rings", 1178, "J.R.R. Tolkien", "1954-07-29"));
		books.add(new Book("Alice's Adventures in Wonderland", 96, "Lewis Carroll", "1865-11-26"));
		
		books.stream().map(i->i.getName()+" By "+i.getAuthor()).forEach(i -> System.out.println(i));
		System.out.println("-------------------------");
		books.stream().filter(i -> i.getPageNum()>250).forEach(i -> System.out.println(i.getName()+" "+i.getPageNum()));
	}
}
