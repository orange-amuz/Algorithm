package BOJ;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str;
		boolean isPalindrome = false;
		
		while(true) {
			str = input.next();
			
			if(str.charAt(0) == '0')
				break;
			
			for(int i = 0 ; i < str.length(); i++) {
				if(str.charAt(i) == str.charAt(str.length() - i - 1))
					isPalindrome = true;
				else {
					isPalindrome = false;
					break;
				}
			}
			
			if(isPalindrome)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}
		
	}

}
