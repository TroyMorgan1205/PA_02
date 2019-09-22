import java.util.Scanner;

public class PA2_01 {

	public static void main(String[] args) {
		

		
		int passcode;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int temp;
	
		Scanner scnr = new Scanner(System.in);
		
		
		System.out.println("What are your 4 digits: ");
		passcode = scnr.nextInt();
		
		
		firstDigit = (passcode / 1000);
		secondDigit = ( passcode % 1000);
		secondDigit = (secondDigit / 100);
		thirdDigit = (passcode % 100);
		thirdDigit = (thirdDigit / 10);
		fourthDigit = (passcode % 10);
		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit);
		
		temp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp;
		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit);
		
		
		firstDigit = (firstDigit + 3) % 10;
		secondDigit = (secondDigit + 3) % 10;
		thirdDigit = (thirdDigit + 3) % 10;
		fourthDigit = (fourthDigit + 3) % 10;	
		
		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit);
		
	}

}
