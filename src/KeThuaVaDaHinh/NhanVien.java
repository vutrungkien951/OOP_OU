package KeThuaVaDaHinh;

import java.util.Scanner;

public class NhanVien {
	private int maSo;
	private String cmnd;
	private String hoTen;
	private String queQuan;
	private String gioiTinh;
	private String dienThoai;
	private static int dem = 0;
	
	{
		dem++;
	}
	/**
	 * Phuong thuc tao nhan vien
	 * @param cmnd: chung minh nhan dan
	 * @param hoTen: ho va ten
	 * @param queQuan: que quan
	 * @param gioiTinh: gioi tinh nam/nu
	 * @param dienThoai: so dien thoai
	 */
	public NhanVien(String cmnd, String hoTen, String queQuan, String gioiTinh,
			String dienThoai)
	{
		this.maSo = dem;
		this.cmnd = cmnd;
		this.hoTen = hoTen;
		this.queQuan = queQuan;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
	}
	public NhanVien()
	{
		
	}
	public double tinhLuong(int soNgayLam)
	{
		return soNgayLam * 1.0 * 100000;
	}
	public void nhapNv(Scanner scanner)
	{
		System.out.println("Nhap vao ho ten nhan vien:");
		this.hoTen = scanner.nextLine();
		System.out.println("Nhap vao so cmnd:");
		this.cmnd  = scanner.nextLine();
		System.out.println("Nhap vao gioi tinh nv: ");
		this.gioiTinh = scanner.nextLine();
		System.out.println("Nhap vao que quan nv:");
		this.queQuan = scanner.nextLine();
		System.out.println("Nhap vao sdt cua nv: ");
		this.dienThoai = scanner.nextLine();
	}
	public int getMaSo() {
		return maSo;
	}
	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	@Override
	public String toString()
	{
		return String.format("Ho ten: %s\nCmnd: %s\nGioi tinh: %s\nQue quan: %s\nSo dien thoai: %s\n"
				+ "Bo phan: binh thuong", this.hoTen, this.cmnd, this.gioiTinh, this.queQuan, this.dienThoai);
	}
	
}
