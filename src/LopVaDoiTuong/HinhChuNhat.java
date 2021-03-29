package LopVaDoiTuong;

public class HinhChuNhat {
	private Diem diemTrenTrai;
	private Diem diemDuoiPhai;
	private Diem diemDuoiTrai;
	public HinhChuNhat(Diem diemTren, Diem diemDuoi)
	{
		this.diemTrenTrai = diemTren;
		this.diemDuoiPhai = diemDuoi;
		this.diemDuoiTrai = new Diem(diemTrenTrai.getHoanhDo(), diemDuoiPhai.getTungDo());
	}
	public Diem getDiemTrenTrai()
	{
		return diemTrenTrai;
	}
	public Diem getDiemDuoiPhai()
	{
		return diemDuoiPhai;
	}
	public void setDiemTrenTrai(Diem d)
	{
		this.diemTrenTrai = d;
	}
	public void setDiemDuoiPhai(Diem d)
	{
		this.diemDuoiPhai = d;
	}
	public double tinhDienTich()
	{
		double canh1 = this.diemTrenTrai.khoangCach(diemDuoiTrai);
		double canh2 = this.diemDuoiTrai.khoangCach(diemDuoiPhai);
		return (canh1*canh2);
	}
	public double tinhChuVi()
	{
		double canh1 = this.diemTrenTrai.khoangCach(diemDuoiTrai);
		double canh2 = this.diemDuoiTrai.khoangCach(diemDuoiPhai);
		return (canh1+canh2)*2;
	}
	public void hienThi()
	{
		this.diemTrenTrai.hienThi();
		this.diemDuoiPhai.hienThi();
		System.out.println("Chu vi hinh chu nhat la: " + tinhChuVi());
		System.out.println("Dien tich hinh chu nhat la: " + tinhDienTich());
	}
}
