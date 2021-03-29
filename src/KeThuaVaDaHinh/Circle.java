package KeThuaVaDaHinh;

public class Circle extends Ellipse{
	public Circle(double bk)
	{
		super(bk, bk);
	}
	@Override
	public String toString()
	{
		String str = "Hinh Circle\nDien tich: " + this.tinhDienTich() + "\nChuVi: " + this.tinhChuVi();
		return str;
	}
}
