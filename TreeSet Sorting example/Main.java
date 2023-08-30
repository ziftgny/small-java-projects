package project1;

import java.util.*;

public class Main {


	public static void main(String[] args)  {
		
		TreeSet<Book> set1= new TreeSet<>();
		set1.add(new Book("The Enigma Code",31,"Abuzer Kömürcü"," 2022-04-15"));
		set1.add(new Book("Echoes of Eternity", 512, "Benjamin Anderson", "2023-01-08"));
		set1.add(new Book("Sapphire Skies", 143, "Maya Thompson", "2021-11-22"));
		set1.add(new Book("Sapphire Skies", 143, "Maya Thompson", "2021-11-22"));
		set1.add(new Book("Whispers in the Wind", 387, "Daniel Harris", "2023-06-19"));
		set1.add(new Book("Chronicles of Unity", 621, "Olivia Miller", "2022-09-03"));
		set1.add(new Book("Chronicles of Unity", 621, "Olivia Miller", "2022-09-03"));
		
		
		for (Book i : set1 ) {
			System.out.println(i.getName());
		}
		System.out.println("-----------------------------");
		
		TreeSet<Book> set2= new TreeSet<>(new Comparator<>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getNumberofpages()-o2.getNumberofpages();
			}
		});
		
		
		set2.add(new Book("The Enigma Code",31,"Abuzer Kömürcü"," 2022-04-15"));
		set2.add(new Book("Echoes of Eternity", 512, "Benjamin Anderson", "2023-01-08"));
		set2.add(new Book("Sapphire Skies", 143, "Maya Thompson", "2021-11-22"));
		set2.add(new Book("Sapphire Skies", 143, "Maya Thompson", "2021-11-22"));
		set2.add(new Book("Whispers in the Wind", 387, "Daniel Harris", "2023-06-19"));
		set2.add(new Book("Chronicles of Unity", 621, "Olivia Miller", "2022-09-03"));
		set2.add(new Book("Chronicles of Unity", 621, "Olivia Miller", "2022-09-03"));
		for (Book i : set2 ) {
			System.out.println(i.getName()+" "+i.getNumberofpages());
		}
	}



}
