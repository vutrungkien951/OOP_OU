package KeThuaVaDaHinh;

import LopTruuTuongVaGiaoDien.Hinh;

public class HinhChuNhat extends Hinh{
	private double chieuDai;
	private double chieuRong;
	
	public HinhChuNhat(double dai, double rong)
	{
		this.chieuDai = dai;
		this.chieuRong = rong;
	}
	public void setChieuDai(double dai)
	{
		this.chieuDai = dai;
	}
	public void setChieuRong(double rong)
	{
		this.chieuRong = rong;
	}
	public double getChieuDai()
	{
		return this.chieuDai;
	}
	public double getChieuRong()
	{
		return this.chieuRong;
	}
	public double tinhDienTich()
	{
		double dienTich = this.chieuDai * this.chieuRong;
		return dienTich;
	}
	public double tinhChuVi()
	{
		double chuVi = (this.chieuDai + this.chieuRong) * 2;
		return chuVi;
	}
	@Override
	public String toString()
	{
		String str = "Hinh chu nhat\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
		return str;
	}
}
