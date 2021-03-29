package KeThuaVaDaHinh;

public class NhanVienC extends NhanVien{

	public NhanVienC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienC(String cmnd, String hoTen, String queQuan, String gioiTinh, String dienThoai) {
		super(cmnd, hoTen, queQuan, gioiTinh, dienThoai);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong(int soNgayLam) {
		// TODO Auto-generated method stub
		return 100000*2.5*soNgayLam;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ho ten: %s\nCmnd: %s\nGioi tinh: %s\nQue quan: %s\nSo dien thoai: %s\n"
				+ "Bo phan: B", this.getHoTen(), this.getCmnd(), this.getGioiTinh(), 
				this.getQueQuan(), this.getDienThoai());
	}
	
}
