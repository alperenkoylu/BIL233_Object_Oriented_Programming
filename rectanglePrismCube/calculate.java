public class calculate {

	public static void main(String[] args) {
		
		rectangle r1 = new rectangle();
		r1.setRectangle(4, 6);

		System.out.println("Area of rectangle			: " + r1.area());
		System.out.println("Circumference of rectangle		: " + r1.circumference());
		
		prism pr1 = new prism();
		pr1.setPrism(10);

		System.out.println("\nVolume of prism				: " + pr1.volume(r1));
		System.out.println("Surface of prism			: " + pr1.surface(r1));
		
		cube c1 = new cube();
		c1.setCube(3);

		System.out.println("\nVolume of cube				: " + c1.volume());
		System.out.println("Surface of cube				: " + c1.surface());
	}

}
