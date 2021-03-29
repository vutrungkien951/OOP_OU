package KeThuaVaDaHinh;
import java.util.*;

public class DSSanPham {
	private List<SanPham> dsSanPham;
	
	public DSSanPham()
	{
		dsSanPham = new ArrayList<>();
	}
	public void themSanPham(SanPham sp)
	{
		dsSanPham.add(sp);
	}
	public void xoaSanPham(SanPham sp)
	{
		dsSanPham.remove(sp);
	}
	public void xoaSanPham(String maSP)
	{
		for(SanPham sp: dsSanPham)
		{
			if(sp.getMaSP().equals(maSP))
			{
				dsSanPham.remove(sp);
			}
		}
	}
	public void capNhatSanPham(String maSP, String ten, String moTa, double gia)
	{
		for(SanPham sp: dsSanPham)
		{
			if(sp.getMaSP().equals(maSP))
			{
				sp.setTenSP(ten);
				sp.setMoTaSP(moTa);
				sp.setGiaBan(gia);
			}
		}
	}
	public List<SanPham> timKiem(String tuKhoa)
	{
		List<SanPham> list = new ArrayList<>();
		for(SanPham sp: dsSanPham)
		{
			if(sp.getTenSP().equals(tuKhoa))
			{
				list.add(sp);
			}
		}
		return list;
	}
	public List<SanPham> timKiem(double tuGia, double denGia)
	{
		List<SanPham> list = new ArrayList<>();
		for(SanPham sp: dsSanPham)
		{
			if((sp.getGiaBan()>=tuGia) & (sp.getGiaBan() <= denGia))
			{
				list.add(sp);
			}
		}
		return list;
	}
	
	public void sapXep()
	{
		Collections.sort(dsSanPham);
	}
	
	public void xuatThongTin()
	{
		for(SanPham sp: dsSanPham)
		{
			System.out.println(sp + "\n");
		}
	}
		
	
}
