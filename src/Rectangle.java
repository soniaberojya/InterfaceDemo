
public class Rectangle implements Shape
{
	private double Width;
	private double height;

	
	
	public Rectangle(double width, double height) {
		super();
		this.Width = width;
		this.height = height;
	}
	
	
	@Override
	public void draw() 
	{
		System.out.println("Drawing Rectangle");

	}


	@Override
	public double getArea() 
	{
		
		return this.height * this.Width;
	}

}
