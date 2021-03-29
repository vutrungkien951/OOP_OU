package LopVaDoiTuong;

import java.util.Scanner;


public class bai6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QLHocVien dsHV = new QLHocVien();
		HocVien hv1 = new HocVien();
		hv1.nhapThongTin(sc);
		hv1.nhapDiem(sc);
		
		hv1.hienThi();
		HocVien hv2 = new HocVien();
		hv2.nhapThongTin(sc);
		hv2.nhapDiem(sc);
		
		HocVien hv3 = new HocVien();
		hv3.nhapThongTin(sc);
		hv3.nhapDiem(sc);
		
		dsHV.themHocVien(hv1);
		dsHV.themHocVien(hv2);
		dsHV.themHocVien(hv3);
		
		dsHV.sapXep();
		
		
		sc.close();
	}

}
