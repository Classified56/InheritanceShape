
public class EquilateralTriangle extends Triangle
	{
		public EquilateralTriangle(double b)
			{
				base = b;
				height = (base / 2) * Math.sqrt(3);
			}
		public void findPerimeter()
			{
				perimeter = base * 3;
			}
	}
