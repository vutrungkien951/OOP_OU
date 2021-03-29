package KeThuaVaDaHinh;

import java.util.Scanner;
public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DSSanPham dsSanPham = new DSSanPham();
		
		SanPham sp1 = new SanPham();
		SanPham sp2 = new Sach();
		SanPham sp3 = new BangDia();
		
		Scanner sc = new Scanner(System.in);
		sp1.nhapSanPham(sc);
		sp2.nhapSanPham(sc);
		sp3.nhapSanPham(sc);
		
		dsSanPham.themSanPham(sp1);
		dsSanPham.themSanPham(sp2);
		dsSanPham.themSanPham(sp3);
		dsSanPham.sapXep();
		
		dsSanPham.xuatThongTin();
	}

}
