
public class Rectangle {
	//fields
	private double length = 0;
	private double width = 0;
	
	//methods
	public double setWidth()
	{
		return width;
	}
	public double setHeight()
	{
		return 
	}
	public double getWidth()
	{
		return
	}
	public double getHeight()
	{
		
	}
	public double area()
	{
		return length * width;
	}
	public double perimeter()
	{
		return length * 2 + width * 2;
	}
	public double diagonalLength(double diagonalLength)
	{
		diagonalLength = Math.pow(length,2) + Math.pow(width, 2);
		diagonalLength = Math.sqrt(diagonalLength);
		return diagonalLength;
	}

}
