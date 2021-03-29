package KeThuaVaDaHinh;

import java.text.SimpleDateFormat;
import java.util.*;


public class TaiKhoanCoKyHan extends TaiKhoan{
	enum KyHan{
		MOT_TUAN,
		MOT_THANG,
		MOT_NAM
	}
	private KyHan kyHan;
	private GregorianCalendar ngayDaoHan;
	private static final SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
	
	public TaiKhoanCoKyHan(String tenTk, String email, String diaChi,
			double soTien, KyHan kyHan)
	{
		super(tenTk, email, diaChi, soTien);
		this.kyHan = kyHan;
	}
	public boolean ktDaoHan()
	{
		Date now = new Date();
		sf.setCalendar(ngayDaoHan);
		String strNgayDaoHan = sf.format(this.ngayDaoHan.getTime());
		if(strNgayDaoHan.equals(sf.format(now)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void capNhatDaoHan()
	{
		if(this.ktDaoHan())
		{
			this.ngayDaoHan.add(Calendar.DAY_OF_YEAR, 
					this.laySoNgay(this.ngayDaoHan));
		}
	}
	public double tinhTienLai()
	{
		double tienLai = 0;
		if(this.ktDaoHan())
		{
			switch(this.kyHan)
			{
				case MOT_NAM:
					tienLai = this.getSoTien() * 6.8/100;
					break;
				case MOT_THANG:
					tienLai = this.getSoTien() * (4.5/100)/12;
					break;
				case MOT_TUAN:
					tienLai = this.getSoTien() * (0.5/100)/52;
					break;
			}
		}
		return tienLai;
	}
	private int laySoNgay(GregorianCalendar d)
	{
		int soNgay = 0;
		switch(this.kyHan)
		{
		case MOT_NAM:
			soNgay = d.getActualMaximum(Calendar.DAY_OF_YEAR);
			break;
		case MOT_THANG:
			soNgay = d.getActualMaximum(Calendar.DAY_OF_MONTH);
			break;
		case MOT_TUAN:
			soNgay = d.getActualMaximum(Calendar.DAY_OF_WEEK);
			break;
		}
		return soNgay;
	}
}
