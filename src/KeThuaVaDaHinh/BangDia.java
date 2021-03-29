package KeThuaVaDaHinh;

import java.util.Date;
import java.util.Scanner;

public class BangDia extends SanPham{
	private float thoiGianPhat;
	
	public BangDia()
	{
	
	}
	public BangDia(String msp, String tsp, String mtsp, Date nsx, double gb, float tgp)
	{
		super(msp, tsp, mtsp, nsx, gb);
		this.thoiGianPhat = tgp;
	}
	
	public void setThoiGianPhat(float tgp)
	{
		this.thoiGianPhat = tgp;
	}
	public float getThoiGianPhat()
	{
		return this.thoiGianPhat;
	}
	public void nhapSanPham(Scanner scanner)
	{
		super.nhapSanPham(scanner);
		System.out.println("Moi ban nhap vao thoi gian phat: ");
		float tgp = scanner.nextFloat();
		this.thoiGianPhat = tgp;
	}
	@Override
	public String toString()
	{
		String strThoiGianPhat = String.valueOf(this.thoiGianPhat);
		String str = super.toString() + "\nThoi gian phat: ".concat(strThoiGianPhat);
		return str;
	}
}
