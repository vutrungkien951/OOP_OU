package KeThuaVaDaHinh;
import LopTruuTuongVaGiaoDien.Hinh;

public class TamGiac extends Hinh{
	private double a;
	private double b;
	private double c;
	
	public TamGiac(double a, double b, double c)
	{
		boolean isTamGiac = false;
		if(a + b >= c)
		{
			isTamGiac = true;
		}
		else if(a + c >= b)
		{
			isTamGiac = true;
		}
		else if(b + c >= a)
		{
			isTamGiac = true;
		}
		if(isTamGiac == true)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	public double tinhDienTich()
	{
		double p = (this.a + this.b + this.c)/2;
		double dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return dienTich;
	}
	public double tinhChuVi()
	{
		double chuVi = this.a + this.b + this.c;
		return chuVi;
	}
	
	@Override
	public String toString()
	{
		String str = "Hinh tam giac\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
		return str;
	}
}
