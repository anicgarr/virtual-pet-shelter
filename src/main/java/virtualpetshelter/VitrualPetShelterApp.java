package virtualpetshelter;

import java.util.Collection;
import java.util.Scanner;

public class VitrualPetShelterApp {

	private static String description;
	private static String name;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter allPets = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Niko", "nice little cat");
		VirtualPet pet2 = new VirtualPet("Moochi", "big fat cat");
		VirtualPet pet3 = new VirtualPet("Kumar", "sleepy cat");
		VirtualPet pet4 = new VirtualPet("Naynay", "hungry cat");

		allPets.add(pet1);
		allPets.add(pet2);
		allPets.add(pet3);
		allPets.add(pet4);

		Collection<VirtualPet> petCollection = allPets.getAllPets();

		System.out.println("Welcome to the WCCI Pet Shelter");

		System.out.println("Enter 1 to feed all the pets ");
		System.out.println("2 to give water to all the pets");
		System.out.println("3 to play with an individual pet");
		System.out.println("4 to allow adoption of a pet");
		System.out.println("5 to allow intake of a pet");
		System.out.println("6 to get pet statuses");
		System.out.println("7 to quit");

		do {
			allPets.tickAllPets(petCollection);
			System.out.println("What would you like to do now?");
			int desiredAction = input.nextInt();

			if (desiredAction == 1) {
				allPets.feedAllPets(petCollection);

				System.out.println("Your pets are eating...");

			} else if (desiredAction == 2) {
				allPets.waterAllPets(petCollection);
				System.out.println("Your pets are drinking water...");

			} else if (desiredAction == 3) {
				System.out.println("What pet would you like to play with? Enter their name");

do {
				for (VirtualPet pet : petCollection) {
					System.out.println(pet.getName());
				}
		
				String desiredPetToPlay = input.next();
				VirtualPet playedPet = allPets.findPet(desiredPetToPlay);
				if (petCollection.contains(playedPet)) { 
					playedPet.play();
					System.out.println("You are playing with " + desiredPetToPlay);
					break;
				}else {		
					System.out.println("That pet isn't in this shelter. Please choose one from the list");
				}

				
			}
while(true);
			}else if (desiredAction == 4) {
				System.out.println("Who would you like to adopt? Enter their name.");
		do {
				for (VirtualPet pet : petCollection) {
					System.out.println(pet.getName());
				}
				String desiredPetToAdopt = input.nextLine();
				VirtualPet adoptedPet = allPets.findPet(desiredPetToAdopt);

				if (petCollection.contains(adoptedPet)) {
		//VirtualPetShelter.adopt(desiredPetToAdopt);
					System.out.println("Thank you for helping " + adoptedPet.getName() + " find a good home.");
					break;
				} else {
					System.out.println("That's not a valid choice. Try Again.");
				}

			}while(true);
			}else if (desiredAction == 5) {
				System.out.println("What is your new pet's name?");
				String intakePetName=input.next();
				System.out.println("Briefly describe your pet:");
				String intakePetDescrption=input.next();
				VirtualPet intakePet=new VirtualPet(name,description);
				allPets.add(intakePet);
				System.out.println("You have added " +intakePetName +" to the shelter!");

			} else if (desiredAction == 6) {
				allPets.getStatuses(petCollection);
			} 
			else if (desiredAction == 7) {
				System.out.println("Goodbye!");
				System.exit(0);
			}else {
				System.out.println("That's not a valid choice. Try Again.");
			}

		}

		while (true);
	}
}
