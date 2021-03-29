package LopVaDoiTuong;
//import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class bai7 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QLCauHoi dsCauHoi = new QLCauHoi();
		String fileCauHoi = "CauHoi1.txt";
		dsCauHoi.taoCauHoi(sc, fileCauHoi);
		dsCauHoi.docDsCauHoi();
	}

}
