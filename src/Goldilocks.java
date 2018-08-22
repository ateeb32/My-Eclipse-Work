import java.util.ArrayList; // Import ArrayList function

public class Goldilocks { // This class is called Goldilocks
	
	private int weight; // Private variables so we can set Goldilocks Temp and Weight
	private int temp;
	
	ArrayList<Chair> chairs = new ArrayList<Chair>(); // Create ArrayList called chairs
	ArrayList<Chair> suitChairs = new ArrayList<Chair>(); // Create ArrayList called suitChairs
	
	public void weightTemp(int weight, int temp) { // Setting the weight and temp
		
		this.weight = weight;
		this.temp = temp;
		
	}
	
	public void addChair(Chair chair) { // Adding a chair object to an Array
		
		chairs.add(chair);
		
	}
	
	public void checkChair() { // Checking each chair to fit our requirement
		
		for (Chair chair : chairs) {
			
			if (chair.getMaxWeight() >= weight && chair.getMaxTemp() <= temp) {
				suitChairs.add(chair); // Add every suitable chair to "suitChairs" Array
				
			}
		}
	}
	
	public void printChairs() { // Prints out every suitable chair in the array
		
		for (Chair chair : suitChairs) {
			
			System.out.println(chair.getMaxWeight() + "," + chair.getMaxTemp());
		}
	}

}
