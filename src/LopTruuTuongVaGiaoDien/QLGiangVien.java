package LopTruuTuongVaGiaoDien;
import java.util.*;

public class QLGiangVien {
	private List<GiangVien> gvs;
	
	public QLGiangVien()
	{
		gvs = new ArrayList<>();
	}
	public void themGv(GiangVien gv)
	{
		gvs.add(gv);
	}
	public void xoaGv(GiangVien gv)
	{
		gvs.remove(gv);
	}
	public List<GiangVien> traCuu(String tuKhoa)
	{
		List<GiangVien> newList = new ArrayList<>();
		this.gvs.forEach((gv) ->{
			if(gv.getHoTen().equals(tuKhoa))
			{
				newList.add(gv);
			}
			else if(gv.getHocHam().equals(tuKhoa))
			{
				newList.add(gv);
			}
			else if(gv.getHocVi().equals(tuKhoa))
			{
				newList.add(gv);
			}
		});
		return newList;
	}
	public void tinhTienLuong()
	{
		//mac dinh tinh tien luong la 8 gio
		this.gvs.forEach((gv) ->{
			System.out.println(gv);
			System.out.printf("Tien luong: %.2f", gv.tinhTienLuong(8));
			System.out.println();
		});
		System.out.println();
	}
	
}
