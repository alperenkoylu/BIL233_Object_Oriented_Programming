public class cube extends prism {
	
	private double a;
	
	public cube() { }
	
	public void setCube(double a) {
		this.a = a;
	}

	public double surface() {
		rectangle rAux = new rectangle();
		rAux.setRectangle(this.a, this.a);
		
		prism prAux = new prism();
		prAux.setPrism(this.a);

		return prAux.surface(rAux);
	}

	public double volume() {
		rectangle rAux = new rectangle();
		rAux.setRectangle(this.a, this.a);
		
		prism prAux = new prism();
		prAux.setPrism(this.a);
				
		return prAux.volume(rAux);
	}
}
