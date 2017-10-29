package biskuvimCayaDustu;
import java.util.concurrent.ThreadLocalRandom;

public class ninja {
	private String name;
	private int health = 100;
	private int experiencePoint = 0;

	int[] weaponDMG = {0, 4, 6, 8, 10, 12, 14, 16, 18};
	String[] weaponNME = {" SHIELD       ", " KUNAI        ", " SHURIKEN     ", " FUKEDAKE     ",
			" KAKUTE       ", " KUSARI FUNDO ", " JUTTE        ", " NEKO TE      ", " KAMA         "};
	
	public ninja() { }
	
	public void setNinja(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void drinkRedbull() {
		this.health= 100;
	}
	
	public void plusExperience() {
		this.experiencePoint++;
	}
	
	public int getExperience() {
		return this.experiencePoint;
	}
	
	public void attack(ninja enemy) {
		
		int  n = ThreadLocalRandom.current().nextInt(experiencePoint, 10);
		
		switch (n) {
		case 0: //miss_hit
			System.out.println("BLOKCKED HIT WITH <" + weaponNME[n] + ">: 0 | " + this.name +
					"(" + this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
			break;
			
		case 9: //critical_hit
			enemy.health -= (40 + experiencePoint);
			System.out.println("CRITICAL HIT WITH < KATANA       >: " + (40 + experiencePoint) +" | " + this.name + "(" +
			this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
			break;
			
		default: //standart_hit
			enemy.health -= (weaponDMG[n] + experiencePoint);
			System.out.println("STANDART HIT WITH <" + weaponNME[n] + ">: " + (weaponDMG[n] + experiencePoint) +
					" | " + this.name + "(" + this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
			break;
		}			
	}
	
	public boolean amIDead() {
		
		if(this.health <= 0) {
			return true;
		}
		else {
			return false;
		}			
	}

}
