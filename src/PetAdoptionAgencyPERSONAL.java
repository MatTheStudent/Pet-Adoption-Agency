
public class PetAdoptionAgencyPERSONAL {

	public static void main(String[] args) {
		String agencyName = "INSERT COOL AGENCY NAME";
		int numberOfPets = 5;
		String petNames = "Jose, George, Galacto, Bacon, Zeus";
		
		agencyStatus(agencyName, petNames, numberOfPets);
		String bill = "George";
		adoptionAnnouncement(bill);
		numberOfPets = petNumber(numberOfPets);
		petNames = "Jose, Galacto, Bacon, Zeus";
		
		agencyStatus(agencyName, petNames, numberOfPets);
		bill = "Bacon";
		adoptionAnnouncement(bill);
		numberOfPets = petNumber(numberOfPets);
		petNames = "Jose, Galacto, Zeus";
		
		agencyStatus(agencyName, petNames, numberOfPets);
		bill = "Jose";
		adoptionAnnouncement(bill);
		petNames = "Galacto, Zeus";
		numberOfPets = petNumber(numberOfPets);
		
		System.out.println("We at " + agencyName +  " are excited to tell you we have these pets available for adoption: " + petNames + ". " + numberOfPets + " Left.");
		System.out.println("Sorry though, Bill. We only let one person adopt three pets. Enjoy them while you can...");
	}
	
	public static void agencyStatus(String name, String petNames, int number) {
		System.out.println("We at " + name +  " are excited to tell you we have these pets available for adoption: " + petNames + ". " + number + " Left...");
	}
	public static void adoptionAnnouncement(String name) {
		System.out.println("Bill has successfully adopted " + name + ". Congrulations Bill.");
	}
	public static int petNumber(int number) {
		number--;
		return number;
	}

}
