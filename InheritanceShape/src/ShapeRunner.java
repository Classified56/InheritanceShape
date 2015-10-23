import java.util.ArrayList;

public class ShapeRunner
	{
		private static ArrayList<Shape> shapeArray = new ArrayList<Shape>();
		public static void main(String[] args)
			{
				Triangle rt = new RightTriangle(3.0, 4.0);
				setAreaAndPerimeter(rt);
				System.out.println("Right");
				System.out.println(rt);
				
				Triangle et = new EquilateralTriangle(6.0);
				setAreaAndPerimeter(et);
				System.out.println("Equilateral");
				System.out.println(et);
				
				Quadrilateral rct = new Rectangle(5.0, 7.5);
				setAreaAndPerimeter(rct);
				System.out.println("Rectangle");
				System.out.println(rct);
				
				Quadrilateral tp = new Trapezoid(6.0, 3.0, 4.0);
				setAreaAndPerimeter(tp);
				System.out.println("Quadrilateral");
				System.out.println(tp);
				
				shapeArray.add(rt);
				shapeArray.add(et);
				shapeArray.add(rct);
				shapeArray.add(tp);
				System.out.println(shapeArray);
			}
		public static void setAreaAndPerimeter(Shape x)
			{
				x.findArea();
				x.findPerimeter();
			}

	}
