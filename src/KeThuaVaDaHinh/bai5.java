package KeThuaVaDaHinh;

import java.util.*;
public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DsNhanVien dsNv = new DsNhanVien();
		Scanner sc = new Scanner(System.in);
		NhanVien nv1 = new NhanVien();
		nv1.nhapNv(sc);
		NhanVien nv2 = new NhanVienA();
		nv2.nhapNv(sc);
		
		dsNv.themNhanVien(nv1);
		dsNv.themNhanVien(nv2);
		dsNv.hienThi();
	}

}
