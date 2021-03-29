package LopTruuTuongVaGiaoDien;

public class Rectangle implements Movable{
	private double x;
	private double y;
	private double a;
	private double b;
	
	public Rectangle(double x, double y, double a, double b)
	{
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}
	public void moveUp()
	{
		this.y += 1;
	}
	public void moveDown()
	{
		this.y += -1;
	}
	public void moveLeft()
	{
		this.x += -1;
	}
	public void moveRight()
	{
		this.x += 1;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
}
