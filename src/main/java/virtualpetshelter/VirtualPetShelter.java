package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private static final int VirtualPet = 0;
	private static final int Collection = 0;
	Map<String, VirtualPet> allPets = new HashMap<>();// <string, virtual pet object>

	public void add(VirtualPet pet) {
		allPets.put(pet.getName(), pet);
	}

	public VirtualPet findPet(String name) {
		return allPets.get(name);
	}

	public Collection<VirtualPet> getAllPets() {
		return allPets.values();
	}

	public void adopt(VirtualPet pet) {
		allPets.remove(pet.getName(), pet);
	}

	public void playWithPet(String name) {
		allPets.get(name).play();
	}

	public void feedAllPets(Collection<VirtualPet> allPets) {
		for (VirtualPet pet : allPets) {
			pet.feedPet();
		}
	}

	public void waterAllPets(Collection<VirtualPet> allPets) {
		for (VirtualPet pet : allPets) {
			pet.giveWater();
		}
	}

	public void tickAllPets(Collection<VirtualPet> allPets) {
		for (VirtualPet pet : allPets) {
			pet.tick();
		}
	}

	public void getStatuses(Collection<VirtualPet> allPets) {
		System.out.println("\tNAME\t|HUNGER\t|THIRST\t|BOREDOM |ENERGY  |");
		System.out.println("_______|_______|_______|________|________|");
		for (VirtualPet pet : allPets) {
System.out.println(pet.getName()+"\t\t| " + pet.getHunger()+"\t|" +pet.getThirst() + "\t|" + pet.getBoredom()+"\t|"+pet.getEnergy()  + "\t| ");

		}
		System.out.println("______________________________________________");

	}

}
