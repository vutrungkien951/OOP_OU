package LopTruuTuongVaGiaoDien;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class GvCoHuu extends GiangVien{
	private double luongCb;
	private float heSo;
	public GvCoHuu(String hoTen, Date ngaySinh, String hocHam, String hocVi, Date ngayBatDau, double luong, float heSo) {
		super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
		this.luongCb = luong;
		this.heSo = heSo;
		// TODO Auto-generated constructor stub
	}
	public GvCoHuu() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double tinhTienLuong(float soGio)
	{
		return soGio * 90000 + this.luongCb * this.heSo;
	}
	@Override
	public void nhapThongTin(Scanner sc) throws ParseException
	{
		super.nhapThongTin(sc);
		System.out.println("Nhap luong co ban: ");
		this.luongCb = sc.nextDouble();
		System.out.println("Nhap he so: ");
		this.heSo = sc.nextFloat();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
