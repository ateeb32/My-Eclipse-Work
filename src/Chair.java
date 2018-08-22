
public class Chair { // This Chair class represents an object
	
	private int maxWeight; // Making a private int for maxWeight
	private int maxTemp; // Making a private int for maxTemp
	
		public Chair(int weight, int temp) { // Constructor (initialisation of class/object)
			
			this.maxWeight = weight; // Weight links back to data from GoldilocksMain
			this.maxTemp = temp; // Temp links back to data from GoldilocksMain
		}
		
		public int getMaxWeight() { // Getters allow other classes to access these variables i.e. Weight and Temp
			return maxWeight;
		}
		
		public int getMaxTemp() { // Getters allow other classes to access these variables i.e. Weight and Temp
			return maxTemp;
		}

}
