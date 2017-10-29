import java.util.Random;

public class ninja {
	private String name;
	private int health = 100;

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
	
	public void attack(ninja enemy) {
		
		Random rnd = new Random();
		int  n = rnd.nextInt(10);
		
		switch (n) {
		case 0: //miss_hit
			System.out.println("BLOKCKED HIT WITH <" + weaponNME[n] + ">: 0 | " + this.name +
					"(" + this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
			break;
			
		case 9: //critical_hit
			enemy.health -= 40;
			System.out.println("CRITICAL HIT WITH < KATANA       >: 40 | " + this.name + "(" +
			this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
			break;
			
		default: //standart_hit
			enemy.health -= weaponDMG[n];
			System.out.println("STANDART HIT WITH <" + weaponNME[n] + ">: " + weaponDMG[n] +
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
