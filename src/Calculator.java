import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		int op, num1, num2;
		char ans = 'N';
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select Operation number:");
			System.out.println("Addition: 1");
			System.out.println("Subtraction: 2");
			System.out.println("Division: 3");
			System.out.println("Multiplication: 4");
			op = sc.nextInt();
			System.out.println("Enter first number: ");
			num1 = sc.nextInt();
			System.out.println("Enter second number: ");
			num2 = sc.nextInt();
			if ((op == 3) && (num2 == 0)){
				System.out.println("Divisor cannot be zero");
				System.out.println("Enter a non-zero second number: ");
				num2 = sc.nextInt();
			}
				
			CalcFunctions cf = new CalcFunctions();
			switch (op){
			case 1: System.out.println("Addition of " + num1 + " and " + num2 + " is: " + cf.sum(num1, num2));
					break;
			case 2: System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + cf.subtract(num1, num2));
					break;
			case 3: System.out.println("Division of " + num1 + " and " + num2 + " is: " + cf.divide(num1, num2));
					break;
			case 4: System.out.println("Addition of " + num1 + " and " + num2 + " is: " + cf.multiply(num1, num2));
					break;
			default: System.out.println("Invalid Operation");
			} //switch ends
			System.out.println();
			System.out.println("Do you want to continue(Y/N)? ");
			ans = sc.next().charAt(0);
		} while (ans=='Y');  
		System.out.println();
		System.out.println("Operation done!");
	}

}
