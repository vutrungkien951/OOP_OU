package KeThuaVaDaHinh;

import java.text.ParseException;
import java.lang.Comparable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanPham implements Comparable<SanPham>{
	private String maSP;
	private String tenSP;
	private String moTaSP;
	private Date ngaySX;
	private double giaBan;
	
	public SanPham()
	{
		
	}
	public SanPham(String msp, String tsp, String mtsp, Date nsx, double gb)
	{
		this.maSP = msp;
		this.tenSP = tsp;
		this.moTaSP = mtsp;
		this.ngaySX = nsx;
		this.giaBan = gb;
	}
	
	public String getMaSP()
	{
		return this.maSP;
	}
	public String getTenSP()
	{
		return this.tenSP;
	}
	public String getMoTaSP()
	{
		return this.moTaSP;
	}
	public Date getNgaySX()
	{
		return this.ngaySX;
	}
	public double getGiaBan()
	{
		return this.giaBan;
	}
	
	public void setMaSP(String msp)
	{
		this.maSP = msp;
	}
	public void setTenSP(String tsp)
	{
		this.tenSP = tsp;
	}
	public void setMoTaSP(String mtsp)
	{
		this.moTaSP = mtsp;
	}
	public void setNhaSX(Date nsx)
	{
		this.ngaySX = nsx;
	}
	public void setGiaBan(double gb)
	{
		this.giaBan = gb;
	}
	public void nhapSanPham(Scanner scanner)
	{
		System.out.println("Moi ban nhap vao ma sp:");
		String strMaSP = scanner.nextLine();
		System.out.println("Moi ban nhap vao ten SP:");
		String strTenSP = scanner.nextLine();
		System.out.println("Moi ban nhap vao mo ta sp: ");
		String strMoTaSP = scanner.nextLine();
		System.out.println("Moi ban nhap vao ngay san xuat (ngay/thang/nam): ");
		String strNgaySX = scanner.nextLine();
		System.out.println("Moi ban nhap vao gia ban cua sp:");
		double gb = scanner.nextDouble();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date nsx;
		try {
			nsx = f.parse(strNgaySX);
			this.ngaySX = nsx;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.maSP = strMaSP;
		this.tenSP = strTenSP;
		this.moTaSP = strMoTaSP;
		this.giaBan = gb;
		
		return;
	}
	@Override
	public int compareTo(SanPham sp)
	{
		if(this.getGiaBan() < sp.getGiaBan())
		{
			return 1;
		}
		else if(this.getGiaBan() > sp.getGiaBan())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public String toString()
	{
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String str = "Ma SP: ".concat(this.maSP) + "\nTen SP: ".concat(this.tenSP);
		str += "\nMo ta: ".concat(this.moTaSP) + "\nNgay san xuat: ".concat(f.format(this.ngaySX));
		String strGiaBan = String.valueOf(this.giaBan);
		str += "\nGia ban: ".concat(strGiaBan);
		return str;
	}
}
