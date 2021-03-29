package KeThuaVaDaHinh;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong(double canh)
	{
		super(canh,canh);
	}
	@Override
	public String toString()
	{
		String str = "Hinh vuong\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
		return str;
	}
}
