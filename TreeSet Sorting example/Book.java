package project1;

public class Book implements Comparable<Book> {
	
	private String name;
	private int numberofpages;
	private String author;
	private String date;
	
	
	
	public Book(String name, int numberofpages, String author, String date) {
		super();
		this.name = name;
		this.numberofpages = numberofpages;
		this.author = author;
		this.date = date;
	}



	@Override
	public int compareTo(Book that) {
		int thatcounter=0;
		int thiscounter=0;
		for(int i =0;i<that.name.length();i++) {
			thatcounter=thatcounter+that.name.charAt(i);
		}
		for(int i =0;i<this.name.length();i++) {
			thiscounter=thiscounter+this.name.charAt(i);
		}
		if(thiscounter>thatcounter) {
			return 1;
		}
		else if(thiscounter<thatcounter) {
			return -1;
		}
		else if(thiscounter==thatcounter){
			return 0;
		}
		return 0;
	
	}



	public String getName() {
		return name;
	}



	public int getNumberofpages() {
		return numberofpages;
	}



	public String getAuthor() {
		return author;
	}



	public String getDate() {
		return date;
	}
	

}
