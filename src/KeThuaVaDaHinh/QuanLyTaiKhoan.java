package KeThuaVaDaHinh;

import java.util.*;

public class QuanLyTaiKhoan {
	private List<TaiKhoan> dsTaiKhoan;
	
	public QuanLyTaiKhoan()
	{
		this.dsTaiKhoan = new ArrayList<>();
	}
	public void themTaiKhoan(TaiKhoan tk)
	{
		this.dsTaiKhoan.add(tk);
	}
	public TaiKhoan traCuu(String soTk)
	{
		for(TaiKhoan tk: this.dsTaiKhoan)
		{
			if(tk.getSoTaiKhoan().equals(soTk))
			{
				return tk;
			}
		}
		return null;
	}
	public void hienThi()
	{
		this.dsTaiKhoan.forEach((tk)->
		{
			System.out.println(tk);
		});
	}
}
