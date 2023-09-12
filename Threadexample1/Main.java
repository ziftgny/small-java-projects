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
	public static void main(String[] args) throws InterruptedException  {
		
		ArrayList<ArrayList<Integer>> sublists = new ArrayList<>();
		ArrayList<Integer> container = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ExecutorService pool= Executors.newFixedThreadPool(4);
		//dividing arraylist with 10000 elements to 4 unique piece
		int quotient = 10000/4;
		for(int i =1;i<=10000;i++) {
			
			container.add(i);
			for(int j =quotient;j<=10000;j=j+2500) {
				if (i==j) {
					sublists.add(new ArrayList<Integer>(container));
					container.clear();
				}
			}
		}
		//executing 4 threads to look and find odd and even numbers in every arraylist piece
		for(int i=0;i<sublists.size();i++) {
			pool.execute(new Adder(odd,even,sublists.get(i)));
		}
		pool.shutdown();
		pool.awaitTermination(5,TimeUnit.SECONDS);
	
		Collections.sort(odd);
		Collections.sort(even);
		System.out.print("Odds: ");
		for(Integer  i : odd) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.print("Evens: ");
		for(Integer i : even) {
			System.out.print(i+" ");
			
		}
		
	}
	
}
