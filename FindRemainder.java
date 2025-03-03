import java.util.Scanner;
class FindRemainder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  First Number: ");
		int firstNumber=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int secondNumber=sc.nextInt();
		
		System.out.println(" The Quotient is "+firstNumber/secondNumber+" and Remainder is "+firstNumber%secondNumber+" of two number "+firstNumber+" and "+secondNumber);
	}
}	