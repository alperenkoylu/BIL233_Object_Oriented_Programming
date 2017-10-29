public class arena {
	
	public static void fight(ninja source, ninja observer, int round) {
		
		ninja aux = new ninja();
		
		for (int i = 0; i < round; i++) {
			while (!observer.amIDead()) {				
				aux = source;
				source = observer;
				observer = aux;
				
				source.attack(observer);				
			}
			
			source.plusExperience();
			System.out.println("\n\t\t!!! " + source.getName() + " WIN !!!\n\n");
			source.drinkRedbull();
			observer.drinkRedbull();
			
			if (source.getExperience() == (round+1)/2) break;
			
			}

			System.out.println("\n\n\t\t!!!!! " + source.getName() + " " + source.getExperience() + " - " + observer.getExperience() + " " + observer.getName());
			System.out.println("\t\t!!!!! END OF THE MATCH " + source.getName() + " WIN !!!!!");
		}
}
