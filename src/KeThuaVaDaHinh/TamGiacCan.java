package KeThuaVaDaHinh;

public class TamGiacCan extends TamGiac{
	public TamGiacCan(double ab, double c)
	{
		super(ab, ab, c);
	}
	
	@Override
	public String toString()
	{
		String str = "Hinh tam giac can\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
		return str;
	}
}
