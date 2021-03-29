package LopVaDoiTuong;

import java.util.*;

public class QLHocVien {
	private List<HocVien> dsHocVien;
	
	public QLHocVien()
	{
		dsHocVien = new ArrayList<HocVien>();
	}
	
	public void themHocVien(HocVien hv)
	{
		dsHocVien.add(hv);
	}
	public void xoaHocVien(HocVien hv)
	{
		dsHocVien.remove(hv);
	}
	public QLHocVien timKiem(String kw)
	{
		QLHocVien searchedDSHocVien = new QLHocVien();
		for(HocVien hv: this.dsHocVien)
		{
			String strMaHV = String.valueOf(hv.getMaHV());
			if((kw.equals(strMaHV)) | (kw.equals(hv.getHoTen()) | (kw.equals(hv.getQueQuan()))))
			{
				searchedDSHocVien.themHocVien(hv);
			}
		}
		return searchedDSHocVien;
	}
	public void sapXep()
	{
		Collections.sort(dsHocVien);
	}
	public void hienThi()
	{
		for(HocVien hv: dsHocVien)
		{
			hv.hienThi();
		}
		return;
	}
	public QLHocVien layDsHocBong()
	{
		QLHocVien dsHocVienLayHocBong = new QLHocVien();
		for(HocVien hv: dsHocVien)
		{
			double tongDiemTB = 0;
			boolean diemDuoi5 = false;
			for(double d: hv.getDiem())
			{
				tongDiemTB += d;
				if(d < 5)
				{
					diemDuoi5 = true;
				}
			}
			double diemTB = tongDiemTB / 3;
			if((diemTB > 8) & (diemDuoi5 == false))
			{
				dsHocVienLayHocBong.themHocVien(hv);
			}
		}
		return dsHocVienLayHocBong;
	}
}
