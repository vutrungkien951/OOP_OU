package KeThuaVaDaHinh;

import java.util.Date;
import java.util.Scanner;

public class Sach extends SanPham{
	private int soTrang;
	
	public Sach()
	{
		
	}
	public Sach(String msp, String tsp, String mtsp, Date nsx, double gb, int st)
	{
		super(msp, tsp, mtsp, nsx, gb);
		this.soTrang = st;
	}
	public void nhapSanPham(Scanner scanner)
	{
		super.nhapSanPham(scanner);
		System.out.println("Nhap vao so trang sach: ");
		int soT = scanner.nextInt();
		this.soTrang = soT;
	}
	public void setSoTrang(int st)
	{
		this.soTrang = st;
	}
	public int getSoTrang()
	{
		return this.soTrang;
	}
	
	@Override
	public String toString()
	{
		String strSoTrang = String.valueOf(this.getSoTrang());
		String str = super.toString() + "\nSo trang: ".concat(strSoTrang);
		return str;
	}
}
