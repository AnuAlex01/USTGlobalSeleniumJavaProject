package Assignments.Day3;
class Shape {
	public void display() {
		System.out.println("This is a shape.");
	}
}
class Circle extends Shape {
	public void circleInfo() {
		System.out.println("This is a Circle.");
	}
}
class Rectangle extends Shape {
	public void rectangleInfo() {
		System.out.println("This is a Rectangle.");
	}
}
public class ShapeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.display();
		c.circleInfo();
		Rectangle r= new Rectangle();
		r.display();
		r.rectangleInfo();
	}

}
