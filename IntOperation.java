import java.util.Scanner;
class IntOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.println("Enter Third Number: ");
		int c=sc.nextInt();
		
		int firstOperation = a + b *c;
		int secondOperation = a * b + c;
		int thirdOperation = c + a / b;
		int fourthOperation = a % b + c;
		
		System.out.println("The results of Int Operations are "+firstOperation+","+secondOperation+","+thirdOperation+" and "+fourthOperation);
	}
}	