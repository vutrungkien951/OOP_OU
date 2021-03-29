package LopTruuTuongVaGiaoDien;
import java.util.Comparator;

public abstract class Hinh {
	private String ten;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Hinh(String ten)
	{
		this.ten = ten;
	}
	public Hinh()
	{
		
	}
	public abstract double tinhDienTich();
	public abstract double tinhChuVi();
	@Override
	public String toString()
	{
		return String.format("<Ten hinh>\nDien tich: <dien tich>\nChu vi:"
				+ "<chu vi>");
	}
	public static Comparator<Hinh> sapXepTheoDienTich = new Comparator<Hinh>()
	{
		@Override
		public int compare(Hinh h1, Hinh h2)
		{
			return (h1.tinhDienTich() > h2.tinhDienTich()) ? -1 : 
				h1.tinhDienTich() < h2.tinhDienTich() ? 1 :0;
		}
	};
	public static Comparator<Hinh> sapXepTheoChuVi = new Comparator<Hinh>()
	{
		@Override
		public int compare(Hinh h1, Hinh h2)
		{
			return h1.tinhChuVi() > h2.tinhChuVi() ? 1 : 
				h1.tinhChuVi() < h2.tinhChuVi() ? -1 : 0;
		}
	};
}
