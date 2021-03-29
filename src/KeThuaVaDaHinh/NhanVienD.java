package KeThuaVaDaHinh;

public class NhanVienD extends NhanVien{
	private double phuCap;
	public NhanVienD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienD(String cmnd, String hoTen, String queQuan, String gioiTinh, String dienThoai,double phuCap) {
		super(cmnd, hoTen, queQuan, gioiTinh, dienThoai);
		this.phuCap = phuCap;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong(int soNgayLam) {
		// TODO Auto-generated method stub
		return 100000*soNgayLam+this.phuCap;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ho ten: %s\nCmnd: %s\nGioi tinh: %s\nQue quan: %s\nSo dien thoai: %s\n"
				+ "Bo phan: D", this.getHoTen(), this.getCmnd(), this.getGioiTinh(), this.getQueQuan(), this.getDienThoai());
	}
	
}
