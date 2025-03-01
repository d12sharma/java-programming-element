import java.util.Scanner;
class Height{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in centimeters");
		double heightInCentimeters = sc.nextDouble();
		
		double inches = heightInCentimeters/2.54;
		int feet = (int)inches/12;
		double remainingInches = inches%12;
		
		
		System.out.println("Your Height in cm is "+heightInCentimeters+" while in feet is "+feet+" and inches is "+remainingInches);
	}
}