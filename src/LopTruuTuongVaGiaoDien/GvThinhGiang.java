package LopTruuTuongVaGiaoDien;

import java.text.ParseException;
import java.util.*;

public class GvThinhGiang extends GiangVien{
	private String noiCongTac;

	public GvThinhGiang(String hoTen, Date ngaySinh, String hocHam, String hocVi, Date ngayBatDau, String noiCT) {
		super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
		this.noiCongTac = noiCT;
		// TODO Auto-generated constructor stub
	}
	public GvThinhGiang() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void nhapThongTin(Scanner sc) throws ParseException
	{
		super.nhapThongTin(sc);
		System.out.println("Nhap vao noi cong tac: ");
		this.noiCongTac = sc.nextLine();
	}
	public double tinhTienLuong(float soGio)
	{
		return 90000 * soGio;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString().concat("Noi cong tac: ") + this.noiCongTac;
	}
	
	
}
