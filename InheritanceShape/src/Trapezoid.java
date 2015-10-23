
public class Trapezoid extends Quadrilateral
	{
		private double base2;
		public Trapezoid(double b1, double b2, double h)
			{
				base = b1;
				base2 = b2;
				height = h;
			}
		
		public void findArea()
			{
				area = ((base + base2) / 2) * height; 
			}
		
		public void findPerimeter()
			{
				perimeter = Math.hypot((Math.abs(base - base2) / 2), height) * 2 + base + base2;
			}

	}
