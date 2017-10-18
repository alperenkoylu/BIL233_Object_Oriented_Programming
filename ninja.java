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
  
  public static class arena {		
		public static void fight(ninja source, ninja observer) {			
			ninja aux = new ninja();
			
			while (!observer.amIDead()) {				
				aux = source;
				source = observer;
				observer = aux;
				
				source.attack(observer);				
			}

			System.out.println("\n\n\t\t!!! " + source.getName() + " WIN !!!");
		}		
	}
	
	public static void main(String[] args) {		
		ninja nj1 = new ninja();
		nj1.setNinja("alperen");

		ninja nj2 = new ninja();
		nj2.setNinja("mustafa");

		arena.fight(nj1, nj2);
	}
