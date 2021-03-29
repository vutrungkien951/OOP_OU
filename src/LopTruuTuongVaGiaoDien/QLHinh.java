package LopTruuTuongVaGiaoDien;
import java.util.*;

public class QLHinh {
	private List<Hinh> dsHinh;
	
	public QLHinh()
	{
		dsHinh = new ArrayList<>();
	}
	public void themHinh(Hinh h)
	{
		dsHinh.add(h);
	}
	public void xoaHinh(Hinh h)
	{
		dsHinh.remove(h);
	}
	public void hienThi()
	{
		dsHinh.forEach((h) ->{
			System.out.println(h + "\n");
		});
	}
	public List<Hinh> layDSHinh(String tenLoaiHinh)
	{
		List<Hinh> listHinh = new ArrayList<>();
		this.dsHinh.forEach((hinh) ->{
			if(hinh.getClass().getName().equals(tenLoaiHinh))
			{
				listHinh.add(hinh);
			}
		});
		return listHinh;
	}
	public void sapXepTheoDienTich()
	{
		Collections.sort(this.dsHinh, Hinh.sapXepTheoDienTich);
	}
	public void sapXepTheoChuVi()
	{
		Collections.sort(this.dsHinh, Hinh.sapXepTheoChuVi);
	}
}
