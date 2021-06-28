import java.util.ArrayList;
import java.util.List;

class Shape {

}

class Rectangle extends Shape {

}

class Circle extends Rectangle {

}

class Square extends Shape {

}

public class LowerBoundExample {
	public static void addRectangle(List<? super Rectangle> RectangleList) {
		RectangleList.add(new Circle());
		System.out.println("Rectangle Added");

	}

	public static void main(String[] args) {

		List<Shape> ShapeList = new ArrayList<Shape>();
		List<Rectangle> RectangleList = new ArrayList<Rectangle>();

		addRectangle(ShapeList);

		addRectangle(RectangleList);
	}

}
