import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		float numberOne = sc.nextInt();
		System.out.println("Enter Number 2:");
		float numberTwo = sc.nextInt();
		
		float addition = numberOne +numberTwo;
		float subtraction = numberOne - numberTwo;
		float multiplication = numberOne * numberTwo;
		float division = numberOne/numberTwo;
		
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+numberOne+" and "+numberTwo+" is " +addition+","+subtraction+","+multiplication + " and "+ division);
		
		
		
	}
}