import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of triangle :");
		double height = sc.nextDouble();
		System.out.println("Enter the base of triangle :");
		double base =sc.nextDouble();
		
		double areaInCm = (1.0/2.0) * base * height;
		double areaInInches = areaInCm/(2.54*2.54);
		
		System.out.println("The Area of the triangle in sq inches is " +areaInInches +" and sq cm is " + areaInCm);
		
		
	}
}