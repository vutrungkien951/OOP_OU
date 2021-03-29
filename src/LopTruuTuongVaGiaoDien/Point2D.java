package LopTruuTuongVaGiaoDien;

public class Point2D implements Movable{
	private double x;
	private double y;
	public Point2D(double x, double y)
	{
		this.x = x;
		this.y = y;
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
	
}
