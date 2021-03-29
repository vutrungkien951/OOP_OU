package LopTruuTuongVaGiaoDien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public abstract class GiangVien{
	SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
	private String hoTen;
	private Date ngaySinh;
	private String hocHam;
	private String hocVi;
	private Date ngayBatDau;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setTen(String ten) {
		this.hoTen = ten;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getHocHam() {
		return hocHam;
	}
	public void setHocHam(String hocHam) {
		this.hocHam = hocHam;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public String getHocVi() {
		return hocVi;
	}
	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}
	public GiangVien(String hoTen, Date ngaySinh, String hocHam, String hocVi, Date ngayBatDau) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.hocHam = hocHam;
		this.ngayBatDau = ngayBatDau;
		this.hocVi = hocVi;
	}
	public GiangVien() {
		// TODO Auto-generated constructor stub
	}
	public abstract double tinhTienLuong(float soGio);
	public void nhapThongTin(Scanner sc) throws ParseException
	{
		System.out.println("Nhap vao ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap vao ngay sinh (ngay/thang/nam): ");
		this.ngaySinh = sf.parse(sc.nextLine());
		System.out.println("Nhap vao hoc ham:");
		this.hocHam = sc.nextLine();
		System.out.println("Nhap vao hoc vi: ");
		this.hocVi = sc.nextLine();
		System.out.println("Nhap vao ngay bat dau (ngay/thang/nam): ");
		this.ngayBatDau = sf.parse(sc.nextLine());
	}
	@Override
	public String toString()
	{
		return String.format("Ho ten: %s\nNgay sinh: %s\nHoc ham: %s\n"
				+ "Hoc vi: %s\nNgay bat dau: %s", this.getHoTen(), sf.format(this.getNgaySinh()),
						this.getHocHam(), this.getHocVi(), sf.format(getNgayBatDau()));
	}
	
}
