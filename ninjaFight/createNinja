import java.util.Random;

	public static class ninja {
	
		private String name;
		private int health = 100;
		
		public ninja() { }

		public void setNinja(String name) {
			
			this.name = name;
		}
		
		public String getName() {
			
			return this.name;
		}
		
		public void attack(ninja enemy) {
			
			Random rnd = new Random();
			int  n = rnd.nextInt(10)+1;
			
			switch (n) {
			case 1: //miss_hit
				System.out.println("MISSED HIT: 0 | " + this.name + "(" + this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
				break;
				
			case 10: //critical_hit
				enemy.health -= 40;
				System.out.println("CRITICAL HIT: 40 | " + this.name + "(" + this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
				break;
				
			default: //standart_hit
				enemy.health -= n*2;
				System.out.println("STANDART HIT: " + n*2 + " | " + this.name + "(" + this.health + "hp) >>> " + enemy.name + "(" + enemy.health + "hp)");
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
