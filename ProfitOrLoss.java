class ProfitOrLoss{
	public static void main(String[] args){
		double sellingPrice = 191;
		double costPrice =129;
		double profit=(sellingPrice-costPrice);
		
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice 
		+ "\n The Profit is INR "+profit+ " and the Profit Percentage is " + (profit/costPrice)*100);
		
	}
}