package KeThuaVaDaHinh;

public class TamGiacDeu extends TamGiacCan{
	public TamGiacDeu(double abc)
	{
		super(abc, abc);
	}
	
	@Override
	public String toString()
	{
		String str = "Hinh tam giac deu\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
		return str;
	}
}
