class VolumeOfEarth{
	public static void main(String [] args){
		double radius = 6378;
		double volumeInKilometers = ((4.0/3.0) * Math.PI * Math.pow(radius,3));
		
		System.out.println("The volume of earth in cubic kilometers is " +volumeInKilometers+" and cubic miles is "+ volumeInKilometers*0.239913);
		
	}
}