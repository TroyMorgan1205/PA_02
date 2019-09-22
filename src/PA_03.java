import java.util.Scanner;

public class PA_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String[] Topics = new String[5];
		int[] Salary = new int[10];
		int[] Transportation = new int[10];
		int[] Exercising = new int[10];
		int[] Studying = new int[10];
		int[] Entertainment = new int[10];
		int ans1;
		int ans2;
		int ans3;
		int ans4;
		int ans5;
		
		Topics[0] = "Salary";
		Topics[1] = "Transportation";
		Topics[2] = "Exercising";
		Topics[3] = "Studying";
		Topics[4] = "Entertainment";
		
		System.out.println("How important is Salary from 1(least important) to 10(most important)?");
		ans1 = scnr.nextInt();
		
		System.out.println("How important is Transportation from 1(least important) to 10(most important)?");
		ans2 = scnr.nextInt();
		
		System.out.println("How important is Exercising from 1(least important) to 10(most important)?");
		ans3 = scnr.nextInt();
		
		System.out.println("How important is Studying from 1(least important) to 10(most important)?");
		ans4 = scnr.nextInt();
		
		System.out.println("How important is Entertainment from 1(least important) to 10(most important)?");
		ans5 = scnr.nextInt();
		
		double Avg1;
		double Avg2;
		double Avg3;
		double Avg4;
		double Avg5;
		
		Salary[ans1]++;
		Transportation[ans2]++;
		Exercising[ans3]++;
		Studying[ans4]++;
		Entertainment[ans5]++;
		
		Avg1 = ans1;
		Avg2 = ans2;
		Avg3 = ans3;
		Avg4 = ans4;
		Avg5 = ans5;
		
		
		
		System.out.println("	        1   2   3   4   5   6   7   8   9   10  | Avg");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(Topics[0] + "   	" + Salary[0] + "   " + Salary[1] + "   " + Salary[2] + "   " + Salary[3] + "   " + Salary[4] + "   " + Salary[5] + "   " + Salary[6] + "   " + Salary[7] + "   " + Salary[8] + "   " + Salary[9] + "   |  " + Avg1);
		System.out.println(Topics[1] + "  " + Transportation[0] + "   " + Transportation[1] + "   " + Transportation[2] + "   " + Transportation[3] + "   " + Transportation[4] + "   " + Transportation[5] + "   " + Transportation[6] + "   " + Transportation[7] + "   " + Transportation[8] + "   " + Transportation[9] + "   |  " + Avg2);
		System.out.println(Topics[2] + "      " + Exercising[0] + "   " + Exercising[1] + "   " + Exercising[2] + "   " + Exercising[3] + "   " + Exercising[4] + "   " + Exercising[5] + "   " + Exercising[6] + "   " + Exercising[7] + "   " + Exercising[8] + "   " + Exercising[9] + "   |  " + Avg3);
		System.out.println(Topics[3] + "   	" + Studying[0] + "   " + Studying[1] + "   " + Studying[2] + "   " + Studying[3] + "   " + Studying[4] + "   " + Studying[5] + "   " + Studying[6] + "   " + Studying[7] + "   " + Studying[8] + "   " + Studying[9] + "   |  " + Avg4);
		System.out.println(Topics[4] + "   " + Entertainment[0] + "   " + Entertainment[1] + "   " + Entertainment[2] + "   " + Entertainment[3] + "   " + Entertainment[4] + "   " + Entertainment[5] + "   " + Entertainment[6] + "   " + Entertainment[7] + "   " + Entertainment[8] + "   " + Entertainment[9] + "   |  " + Avg5);
		
		System.out.println("");
		System.out.println("The Topic with the most most was: " + Topics[0]);
		System.out.println("The Topic with the least points was: " + Topics[1]);
	}

}
