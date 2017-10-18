public class prism extends rectangle {

	private double d;
	
	public prism() { }

	public void setPrism(double de) {
		this.d = de;
	}
	
	public double surface(rectangle re) {
		return 2	*	(	(re.getWidth()*this.d)	+	(re.getWidth()*re.getHeight())	+	(this.d*re.getHeight())	);
	}

	public double volume(rectangle re) {
		return re.area()	*	this.d;
	}
}
