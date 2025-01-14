import java.util.Scanner;
public class PetAdoptionAgency {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	String[] petNames = {"George", "Jose", "Bella", "Cupcake", "Galactus", "Astro", "Spike"};
	String newOwner;
	String adoptedPet;
	int numberOfAdoptedPets = 0;
	boolean adopted = false;
	boolean extend = true;
	
	System.out.println("Hello, welcome to Saffron Pet Adoption Center, just tell us your name and we can get started!");
	newOwner = scanner.nextLine();
	System.out.println("Welcome, " + newOwner + ". Here is our current list of pets up for adoption!");
	
	while (extend == true) {
		System.out.println("What pet would you like to adopt?");
		printPetNames(petNames);
		adoptedPet = scanner.nextLine();
		for(int i = 0; i < petNames.length; i++) {
			if (petNames[i] != null) {
				if (petNames[i].equals(adoptedPet)){
					petNames[i] = null;
					adopted = true;
					numberOfAdoptedPets++;
					break;
				} else if (i == petNames.length - 1) {
					System.out.println("I'm sorry, that pet isn't available for adoption, it doesn't exist at all, are you a little stupid? Here's the list you should have read: ");
					adopted = false;
				}
			}
		}
		if (numberOfAdoptedPets == petNames.length ) {
			extend = false;
			System.out.println("Congratulations on adopting all the pets! ");
			break;
		}
		if (adopted == true) {
			System.out.println("Congratulations You've adopted " + adoptedPet + "! Would you like to adopt any other pets?\ny/n");
			String input  = scanner.nextLine();
			if (input.equals("Yes") || input.equals("yes") || input.equals("Y") || input.equals("y")) {
				continue;
					
			} else if (input.equals("No") || input.equals("no") || input.equals("N") || input.equals("n")) {
				System.out.println("I'm sorry to see you not getting any other pets, the remaining will be euthanized.");
				extend = false;
			} else {
				System.out.println("Sorry, thats not a valid response." );
				
			}
		}
		}
	}
	
	public static void printPetNames(String[] petNames) {
		for(int i = 0; i < petNames.length; i++) {
			if (petNames[i] != null) {
				System.out.println(petNames[i]);
			}
		}
		
	}
}

