public class Main {
	
    public static int string_to_int_converter(String string,int length) {
		//we avoid our recursive function to last infinitely by setting a limit
		if(length<0) {
			return 0;
		}
		//the numbers we want to convert to int and the sign value of it
		int num=0;
		int sign=1;
		//we skip this function if we encounter a non number value
		if(string.charAt(length)<'1' || string.charAt(length) > '9') {
			return string_to_int_converter(string,length-1);
		}
		num = string_to_int_converter(string,length-1);
		num = num*10 + (string.charAt(length)-48);
		//we check if our number is negative or a positive one notice the diff with length variable
		if(string.length()==length+1) {
			if(string.charAt(0)=='-' ) {
				sign = -1;
						}
				}
		
		return num*sign;
	}

	public static void main(String[] args) {
		    String word = "-1232321 3";
			System.out.println(string_to_int_converter(word,word.length()-1));
		}
	}

