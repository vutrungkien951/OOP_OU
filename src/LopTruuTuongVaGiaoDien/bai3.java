package LopTruuTuongVaGiaoDien;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLCauHoi qlCauHoi = new QLCauHoi();
		CauHoi ch1 = new CauHoiLuaChon("How do you know about me?");
		ch1.themPhuongAn(new PhuongAn("Facebook", "Social media", true));
		ch1.themPhuongAn(new PhuongAn("Zalo", "Social media"));
		ch1.themPhuongAn(new PhuongAn("Google", "Website"));
		ch1.themPhuongAn(new PhuongAn("Youtube", "Website"));
		
		qlCauHoi.themCauHoi(ch1);
		
		CauHoi ch2 = new CauHoiLuaChon("Which is my name?");
		ch2.themPhuongAn(new PhuongAn("Kien", "Vu Trung Kien", true));
		ch2.themPhuongAn(new PhuongAn("Master", "Master"));
		ch2.themPhuongAn(new PhuongAn("Wibu god", "Wibu"));
		qlCauHoi.themCauHoi(ch2);
		
		CauHoi ch3 = new CauHoiDienVaoChoTrong("... you often do homework?");
		ch3.themPhuongAn(new PhuongAn("Do", "Question"));
		
		qlCauHoi.themCauHoi(ch3);
		//List<CauHoi> listCauHoi = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		qlCauHoi.luyenTap(sc);
		
	}

}
