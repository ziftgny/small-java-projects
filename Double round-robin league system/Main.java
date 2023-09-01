package project1;

import java.util.*;

public class Main {


	public static void main(String[] args)  {
		
		ArrayList<String> teams = new ArrayList<>();
		teams.add("Galatasaray");	
		teams.add("Bursaspor");	
		teams.add("Fenerbahçe");	
		teams.add("Adanademirspor");	
		teams.add("Beşiktaş");	
		teams.add("Trabzonspor");	
		if(teams.size()%2!=0) {
			teams.add("-empty-");
		}
		int size =teams.size();
		int totalmatches=size*(size-1);
		ArrayList<String> matches = new ArrayList<>();
		//we have size/2 matches every week and we get the week number by diving 
		//total matches to size/2
		for (int i = 0; i < (totalmatches/(size/2)); i++) {
			System.out.println("Week "+(i+1));
			//checks if all teams had a match with each other once if true
			//it starts organizing rematches
			//it basically does the same thing in else brackets just in reversed order
			if(i>=(size-1)) {
			
				for(int j=0;j<(size/2);j++) {
					matches.add(teams.get(size-1-j)+" vs "+teams.get(j));
				}
			}
			else {
				for(int j=0;j<(size/2);j++) {
					matches.add(teams.get(j)+" vs "+teams.get(size-1-j));
				}
			}
			//element positions in teams changes in every week
			teams.add(1,teams.get(size-1));
			teams.remove(size);
			Collections.shuffle(matches);
			for(int a =0;a<(size/2);a++) {
				System.out.println(matches.get(a));
			}
			matches.clear();
		}
		
	
		
		
		
		
		
	
	}
	



}
