package KeThuaVaDaHinh;
import LopTruuTuongVaGiaoDien.Hinh;

public class Ellipse extends Hinh{
	private double bkTrucLon;
	private double bkTrucNho;
	
	public Ellipse(double bkLon, double bkNho)
	{
		this.bkTrucLon = bkLon;
		this.bkTrucNho = bkNho;
	}
	public void setBKTrucLon(double bkLon)
	{
		this.bkTrucLon = bkLon;
	}
	public void setBKTrucNho(double bkNho)
	{
		this.bkTrucNho = bkNho;
	}
	public double getBKTrucLon()
	{
		return this.bkTrucLon;
	}
	public double getBKTrucNho()
	{
		return this.bkTrucNho;
	}
	public double tinhDienTich()
	{
		double dienTich = Math.PI * this.bkTrucLon * this.bkTrucNho;
		return dienTich;
	}
	public double tinhChuVi()
	{
		double chuVi = 2 * Math.PI * Math.sqrt((Math.pow(bkTrucNho, 2) + Math.pow(bkTrucLon, 2)/2));
		return chuVi;
	}
	
	@Override
	public String toString()
	{
		return new String("Hinh Ellipse\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi());
	}
}
