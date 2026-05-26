package Assignments.Day3;

public class RectangleTask {
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int l) {
		length=l;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		width=w;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleTask r=new RectangleTask();
		r.setLength(10);
		r.setWidth(5);
		System.out.println("Length is " + r.getLength());	
		System.out.println("Width is " + r.getWidth());
	}

}
