package StringProgram;

import java.util.Arrays;

public class StringPalindrome {
public static void main(String[] args) {
	String str="MADAM";
	String reverse="";
	char[] ch=str.toCharArray();
	System.out.println("the given String"+ Arrays.toString(ch));
	for(int i=ch.length-1;i>=0;i--) 
		reverse= reverse+ch[i];
		System.out.println(  " reverse array "+reverse);
		if(str.equals(reverse)) {
			System.out.println(" the given string is palindrome "+str);
		}
		else {
			System.out.println(" the given String is not palindrome "+str);
	
	}
}
}
