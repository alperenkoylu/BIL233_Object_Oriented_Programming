public class rectangle {
	
	private double w;
	private double h;
	
	public rectangle() { }
	
	public void setRectangle(double w, double h)
	{
		this.w = w;
		this.h = h;
	}
	
	public double getWidth() {
		return this.w;
	}
	
	public double getHeight() {
		return this.h;
	}
	
	public double circumference()
	{
		return (2*this.w) + (2*this.h);
	}

	public double area()
	{
		return (this.w * this.h);
	}
}
