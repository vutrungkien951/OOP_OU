package LopVaDoiTuong;


public class bai1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem d1 = new Diem(2,3);
		Diem d2 = new Diem(3,4);
		d1.hienThi();
		d2.hienThi();
		System.out.println("Khoang cach giua 2 diem: " + d1.khoangCach(d2));
		
		String c = "D";
		int idx = (c.charAt(0) + 3) % 4;
		
		System.out.println(idx);
	}

}
