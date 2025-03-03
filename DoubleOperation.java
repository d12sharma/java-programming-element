import java.util.Scanner;
class DoubleOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  First Number: ");
		double a=sc.nextDouble();
		System.out.println("Enter Second Number: ");
		double b=sc.nextDouble();
		System.out.println("Enter Third Number: ");
		double c=sc.nextDouble();
		
		double firstOperation = a + b *c;
		double secondOperation = a * b + c;
		double thirdOperation = c + a / b;
		double fourthOperation = a % b + c;
		
		System.out.println("The results of Double Operations are "+firstOperation+","+secondOperation+","+thirdOperation+" and "+fourthOperation);
	}
}	