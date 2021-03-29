package LopTruuTuongVaGiaoDien;

public class Circle implements Movable{
	private double x;
	private double y;
	private double r;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
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
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	 
}
