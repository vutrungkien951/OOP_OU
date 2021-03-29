package KeThuaVaDaHinh;

public class TaiKhoan {
	private static int dem = 0;
	protected String soTaiKhoan;
	protected String tenTaiKhoan;
	protected String diaChi;
	protected String email;
	protected double soTien;
	
	{
		dem++;
	}
	
	public TaiKhoan(String tenTK, String dc, String email, double st)
	{
		this.tenTaiKhoan = tenTK;
		this.diaChi = dc;
		this.email = email;
		this.soTien = st;
		this.soTaiKhoan = String.format("%06d", dem);
	}
	public String getSoTaiKhoan()
	{
		return this.soTaiKhoan;
	}
	public String getTenTaiKhoan()
	{
		return this.tenTaiKhoan;
	}
	public String getEmail()
	{
		return this.email;
	}
	public String getDiaChi()
	{
		return this.diaChi;
	}
	public void rutTien(double soTien) throws Exception
	{
		if(this.ktDaoHan() == false)
		{
			throw new Exception("Chua den ngay dao han.");
		}
		this.soTien -= soTien;
	}
	public void nopTien(double soTien) throws Exception
	{
		if(this.ktDaoHan() == false)
		{
			throw new Exception("Chua den ngay dao han.");
		}
		this.soTien += soTien;
	}
	public boolean ktDaoHan()
	{
		return true;
	}
	public double getSoTien()
	{
		return this.soTien;
	}
	@Override
	public String toString()
	{
		String str = "So tai khoan: ".concat(this.soTaiKhoan) + "\nTen tai khoan: ".concat(this.tenTaiKhoan);
		str += "\nSo tien: ".concat(String.format("%.2f", this.soTien));
		return str;
	}
}
