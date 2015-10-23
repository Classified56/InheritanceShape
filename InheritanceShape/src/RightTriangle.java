
public class RightTriangle extends Triangle
	{
		private double hypotenuse;
		public RightTriangle(double b, double h)
			{
				base = b;
				height = h;
				hypotenuse = Math.hypot(base, height);
			}
		
		public void findPerimeter()
			{
				perimeter = base + height + hypotenuse;
			}
		
	}
