
public class GoldilocksMain {
	public static void main(String[] args) {
		
		Goldilocks g = new Goldilocks(); // Making a new instance (Making a version of our class and giving it a name) of the object
		
		g.weightTemp(100, 80); // Set in temp then weight using the method we set in Goldilocks.class
		
		g.addChair(new Chair(30,50));
		g.addChair(new Chair(130,60));
		g.addChair(new Chair(90,60));
		g.addChair(new Chair(150,85)); // INPUTTING CHAIR DATA
		g.addChair(new Chair(120,70));
		g.addChair(new Chair(200,200));
		g.addChair(new Chair(110,100));
		
		g.checkChair(); // Run the checkChair method from Goldilocks.class
		
		g.printChairs(); // Print out all suitable chairs
	}

}
