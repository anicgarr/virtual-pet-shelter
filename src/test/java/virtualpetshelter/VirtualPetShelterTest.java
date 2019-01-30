package virtualpetshelter;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2;
	
	@Before
public void setUp(){
		underTest= new VirtualPetShelter();
		pet1=new VirtualPet("Niko","nice little cat");
		pet2=new VirtualPet("Moochi", "big fat cat");
	}   
	@Test 
	public void shouldBeAbleToAddAHomelessPet() {
		underTest.add(pet1);
		VirtualPet retrievedPet=underTest.findPet("Niko");
		assertThat(retrievedPet, is(pet1));
	}
	@Test 
	public void shouldBeAbleToAddTwoHomelessPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<VirtualPet> allPets=underTest.getAllPets();
		assertThat(allPets,containsInAnyOrder(pet1,pet2));
	}
	
	@Test 
	public void shouldBeAbleToAdoptAPet() {
		underTest.add(pet1);
		underTest.adopt(pet1);
VirtualPet retrievedPet=underTest.findPet(pet1.getName());
assertThat(retrievedPet,is(nullValue()));
	}
	
	@Test 
	public void shouldBeAbleToPlayWithOnePet() {
		underTest.add(pet1);
		underTest.add(pet2);
		int beginningBoredom=pet1.getBoredom();
		underTest.playWithPet("Niko");
	int endingBoredom=pet1.getBoredom();
	assertEquals(endingBoredom,beginningBoredom-5);
	}
	
	@Test
	public void shouldBeAbleToFeedAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<VirtualPet> allPets=underTest.getAllPets();
		underTest.feedAllPets(allPets);
		int beginningHunger1=pet1.getHunger();
		int endingHunger1=pet1.getHunger();
		assertThat(endingHunger1,is(beginningHunger1));
		

		
	}
	
}

