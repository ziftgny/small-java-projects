package project;

import java.util.ArrayList;

public class Adder implements Runnable {
	private static ArrayList<Integer> odd;
	private static ArrayList<Integer> even;
	private ArrayList<Integer> sublist;
	public Adder(ArrayList<Integer> odd, ArrayList<Integer> even,ArrayList<Integer> sublist) {
		super();
		this.odd=odd;
		this.even=even;
		this.sublist=sublist;
	}
	
	@Override
	public void run() {
			for(Integer i : this.sublist) {
				if(i%2==0) {
						even.add(i);
						System.out.println(Thread.currentThread().getName()+" added "+i+" as even");
				}
				else {
						odd.add(i);
						System.out.println(Thread.currentThread().getName()+" added "+i+" as odd");
				}
			}
		
	}

}
