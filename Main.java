package ilkproje;
import java.lang.Math;
import java.util.Scanner;
public class Main{
	
	static boolean isItPrime(int number,int checker) {
		if(number<=1) 
			return false;
		
		else if (number==2) 
			return true;
		
		else if (number == checker) 
			return true;
			
		else if (number%checker==0)
			return false;		
		
		return isItPrime(number,checker+1);
		
	}

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("please enter the value:");
		   int number = scanner.nextInt();
		   
		   if(isItPrime(number,2))
			   System.out.println("it is a prime number");
		   else 
			   System.out.println("it is not a prime number");
		
	}
	
}
