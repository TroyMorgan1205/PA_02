import java.util.Scanner;


public class PA_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		char ans;

		
		
		System.out.println("Type P for pounds or K for Kilograms you to be measured in.");
		
		ans = scnr.next().charAt(0);
		System.out.println(ans);
		
		if (ans == 'P')
		{
			int BMI;
			int weightInPounds;
			int heightInInches;
			
			System.out.println("Whats your weight in pounds:");
			weightInPounds = scnr.nextInt();
			
			System.out.println("Whats your height in inches: ");
			heightInInches = scnr.nextInt();
			
			BMI = (703 * weightInPounds) / ((heightInInches) * (heightInInches));
			
			System.out.println("Your BMI is: " + BMI);
			
			System.out.println("");
			System.out.println("Underweight: <18.5");
			System.out.println("Normal weight: 18.5 - 24.9");
			System.out.println("Overweight: 24.9 - 29.9");
			System.out.println("Obesity: BMI of 30 or greater");
			
			
		}
		else if (ans == 'K') 
		{
			
			double BMI;
			double weightInKilos;
			double heightInMeters;
			
			System.out.println("Whats your weight in kilos:");
			weightInKilos = scnr.nextDouble();
			
			System.out.println("Whats your height in meters:");
			heightInMeters = scnr.nextDouble();
			
			BMI = (weightInKilos) / ((heightInMeters) * (heightInMeters));
			
			System.out.println("Your BMI is: " + BMI);
			
			System.out.println("");
			System.out.println("Underweight: <18.5");
			System.out.println("Normal weight: 18.5 - 24.9");
			System.out.println("Overweight: 24.9 - 29.9");
			System.out.println("Obesity: BMI of 30 or greater");
			
		}
		
		else
			System.out.println("Invalid input");
		
	}

}
