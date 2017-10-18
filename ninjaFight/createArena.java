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
