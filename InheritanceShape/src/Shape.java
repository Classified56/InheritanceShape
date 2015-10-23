
public abstract class Shape
	{
		protected double area;
		protected double perimeter;
		protected double base;
		protected double height;
		
		public abstract void findArea();
		public abstract void findPerimeter();
		
		@Override
		public String toString()
			{
				return "Shape [area = " + area + ", perimeter = " + perimeter + "]";
			}
		
		
	}
