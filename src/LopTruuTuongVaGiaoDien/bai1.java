package LopTruuTuongVaGiaoDien;
import KeThuaVaDaHinh.*;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLHinh quanLyHinh = new QLHinh();
		
		Hinh h1 = new HinhChuNhat(4, 3);
		Hinh h2 = new HinhVuong(4);
		Hinh h3 = new TamGiac(3, 4, 7);
		
		quanLyHinh.themHinh(h1);
		quanLyHinh.themHinh(h2);
		quanLyHinh.themHinh(h3);
		
		quanLyHinh.sapXepTheoChuVi();
		quanLyHinh.hienThi();
		
		quanLyHinh.sapXepTheoDienTich();
		quanLyHinh.hienThi();
	}

}
