package week3.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int [] arr= {5,2,3,4,7,1,8};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(i != arr[i]) {
            	System.out.println(arr[i]);
            	break;
            }
        	
        }

	}

}
