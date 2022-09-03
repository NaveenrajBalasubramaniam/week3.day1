package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String text="madam";
		String text2="";
		for(int i=text.length()-1; i>=0; i--) {
		    text2= text2+text.charAt(i);
		}
		System.out.println(text2);
		if(text.equals(text2)) 
			System.out.println("Palindrome");
		else 
				System.out.println("Not palindrome");

	}

}
