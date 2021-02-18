
public class ShapeTest 
{
	

	public static void main(String[] args) 
	{
		// Programming for Interface not implementation
		
		Shape shape = new Circle(10);
		Circle c = new Circle(10);
		shape.draw();
		
		System.out.println("Radius of circle = "+c.getRadius());
		System.out.println("Area = "+shape.getArea());
		
		//Switching from one implementation to another easily
		shape = new Rectangle(10,10);
		shape.draw();
		System.out.println("Area = "+shape.getArea());

	}

}
