class Discount{
	public static void main(String [] args){
		int fees =125000;
		int discountPercent=10;
		int discount=(discountPercent*fees)/100;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fees-discount));
	}
	
}