import java.util.Scanner;

public class PA_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		
		firstDigit = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit);
		
		temp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp;
		
		System.out.println("The encryted digits are:" + firstDigit + secondDigit + thirdDigit + fourthDigit);
		
		
		
	}

}
