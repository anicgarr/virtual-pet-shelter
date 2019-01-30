package virtualpetshelter;

public class VirtualPet {
//instance variables
	private int boredom;
	private int hunger;
	private int energy;
	private int thirst;
	private String name;
	private String description;
	
	
	public VirtualPet(String name, String description) {
		this(name,description,0,0,0,0);
	}
	public VirtualPet(String name, String description,int energy, int hunger, int thirst,int boredom) {
		this.name=name;
		this.setDescription(description);
		this.hunger=hunger;
		this.thirst=thirst;
		this.boredom=boredom;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger=hunger;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy=energy;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public void setThirst(int thirst) {
		this.thirst=thirst;
	}
	
	public int getBoredom() {
		return boredom;
	}
	public int setBoredom (int boredom) {
		 return this.boredom=boredom;
	}
	
	public void tick() {
	hunger+=2;
	energy-=2;
	thirst+=2;
	boredom+=2;
	
	}
	
	
	public VirtualPet(String name, int hunger, int energy, int thirst, int boredom) {
		
	}
	
public void feedPet(){
	this.hunger=-5;
	this.thirst=+5;
}
public void giveWater() {
	this.thirst=-5;
}
public void layDownForNap() {
	this.energy=+5;
}
public void play() {
	this.boredom=-5;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
	


