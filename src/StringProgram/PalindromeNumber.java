package StringProgram;

public class PalindromeNumber {
public static void main(String[] args) {
	int num=121;
	int temp=num;
	int rev=0,rem;
	while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
	if(num==rev) {
	System.out.println(" the given number is palindrome number "+num);	
	}
	else {
		System.out.println(" the given number is not palindrome number "+num);	

	}
}
}
