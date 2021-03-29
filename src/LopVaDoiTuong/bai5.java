package LopVaDoiTuong;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo p1 = new PhanSo(1,2);
		PhanSo p2 = new PhanSo(1,3);
		PhanSo p3 = new PhanSo(1,6);
		PhanSo p4 = new PhanSo(1,4);
		
		DsPhanSo ds = new DsPhanSo();
		ds.themPhanSo(p1);
		ds.themPhanSo(p2);
		ds.themPhanSo(p3);
		ds.themPhanSo(p4);
		
		//ds.tinhTong().hienThi();
		
		ds.sapXep();
		ds.hienThi();
	}

}
