package LopVaDoiTuong;

import java.util.ArrayList;
import java.util.Collections;

public class DsPhanSo {
	private ArrayList<PhanSo> ds;
	public DsPhanSo()
	{
		ds = new ArrayList<PhanSo>();
	}
	public void themPhanSo(PhanSo p)
	{
		ds.add(p);
	}
	public void xoaPhanSo(PhanSo p)
	{
		ds.remove(p);
	}
	public PhanSo tinhTong()
	{
		PhanSo tongP = ds.get(0);
		for(int i=1; i < ds.size(); i++)
		{
			tongP.cong(ds.get(i));
		}
		tongP.rutGon();
		return tongP;
	}
	public void sapXep()
	{
		Collections.sort(ds);
	}
	public void hienThi()
	{
		for(PhanSo p: ds)
		{
			p.hienThi();
		}
	}
}
