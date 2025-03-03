import java.util.Scanner;

class FindThePrice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Unit Price :");
		double Unitprice=sc.nextDouble();
		System.out.println("Enter the Quantity :");
		int quantity = sc.nextInt();
		
		System.out.println("The total purchase price is INR " +Unitprice*quantity+" if the quantity "+quantity+" and unit price is INR "+ Unitprice);
		
	}
}