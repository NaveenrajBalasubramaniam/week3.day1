package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
        char[] ch= test.toCharArray();
        for(int i=0; i<ch.length; i++) {
        	if(i%2!=0) {
        		ch[i] = Character.toUpperCase(ch[i]);
        	}
        	System.out.print(ch[i]);
        }
	

	}

}
