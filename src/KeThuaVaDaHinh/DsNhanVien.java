package KeThuaVaDaHinh;
import java.util.*;

public class DsNhanVien {
	private List<NhanVien> dsNv;
	
	public DsNhanVien()
	{
		dsNv = new ArrayList<>();
	}
	public void themNhanVien(NhanVien nv)
	{
		dsNv.add(nv);
	}
	public void xoaNhanVien(NhanVien nv)
	{
		dsNv.remove(nv);
	}
	public void hienThi()
	{
		dsNv.forEach((nv) ->
		{
			System.out.println(nv + "\n");
		});
	}
	public void tinhLuong()
	{
		dsNv.forEach((nv) ->{
			nv.tinhLuong(30);
		});
	}
}
