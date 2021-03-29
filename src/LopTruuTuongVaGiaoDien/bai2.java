package LopTruuTuongVaGiaoDien;
import java.text.ParseException;
import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		QLGiangVien ql = new QLGiangVien();
		GiangVien gv1 = new GvCoHuu();
		GiangVien gv2 = new GvThinhGiang();
		
		Scanner sc = new Scanner(System.in);
		gv1.nhapThongTin(sc);
		gv2.nhapThongTin(sc);
		
		gv1.tinhTienLuong(20);
		gv2.tinhTienLuong(30);
		
		ql.themGv(gv1);
		ql.themGv(gv2);
		
		ql.tinhTienLuong();
	}

}
