package Sam.SeleniumFrameworkDesign;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		Scanner input = new Scanner(System.in);
		System.out.println("What is" + number1 + "+" + number2 + "?");
		int answer = input.nextInt();
		while (number1 + number2 != answer) {
			System.out.println("you got it wrong try again" + " What is" + number1 + "+" + number2 + "?");
			answer = input.nextInt();
		}
		if (number1 + number2 == answer) {
			System.out.println("you're right!");
		}
	}

}
