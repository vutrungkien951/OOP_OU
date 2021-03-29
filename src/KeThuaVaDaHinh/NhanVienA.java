package KeThuaVaDaHinh;

public class NhanVienA extends NhanVien{

	public NhanVienA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienA(String cmnd, String hoTen, String queQuan, String gioiTinh, String dienThoai) {
		super(cmnd, hoTen, queQuan, gioiTinh, dienThoai);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double tinhLuong(int soNgayLam)
	{
		return 100000*1.2*soNgayLam;
	}

	@Override
	public String toString() {
		return String.format("Ho ten: %s\nCmnd: %s\nGioi tinh: %s\nQue quan: %s\nSo dien thoai: %s\n"
				+ "Bo phan: A", this.getHoTen(), this.getCmnd(), this.getGioiTinh(), this.getQueQuan(), this.getDienThoai());
	}
	
}
