package LopVaDoiTuong;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem diem1 = new Diem(2,3);
		Diem diem2 = new Diem(-2,0);
		DoanThang d1 = new DoanThang(diem1, diem2);
		Diem diem3 = new Diem(1,7);
		Diem diem4= new Diem(-1,-5);
		DoanThang d2 = new DoanThang(diem3, diem4);
		
		System.out.println("Do dai d1 la: " + d1.doDai());
		System.out.println("Do dai d2 la: " + d2.doDai());
		
		if(d1.doanThangSongSong(d2))
		{
			System.out.println("d1 va d2 song song!");
		}
		else
		{
			System.out.println("d1 va d2 khong song song!");
		}
	}

}
