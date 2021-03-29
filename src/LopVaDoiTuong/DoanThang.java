package LopVaDoiTuong;

public class DoanThang{
	private Diem diem1;
	private Diem diem2;
	public DoanThang(Diem d1, Diem d2)
	{
		this.diem1 = d1;
		this.diem2 = d2;
	}
	public void setDiem1(Diem d1)
	{
		this.diem1 = d1;
	}
	public void setDiem2(Diem d2)
	{
		this.diem2 = d2;
	}
	public int getHoanhDoDiem1()
	{
		return diem1.getHoanhDo();
	}
	public int getTungDoDiem1()
	{
		return diem1.getTungDo();
	}
	public int getHoanhDoDiem2()
	{
		return diem2.getHoanhDo();
	}
	public int getTungDoDiem2()
	{
		return diem2.getTungDo();
	}
	public void hienThi()
	{
		System.out.println("[(" + diem1.getHoanhDo() + "),(" + diem1.getTungDo() + "), (" + diem2.getHoanhDo() + "),(" + diem2.getTungDo() + ")]");
	}
	public double doDai()
	{
		return Math.abs(diem1.khoangCach(diem2));
	}
	public boolean doanThangSongSong(DoanThang d)
	{
		double kq1 = (this.getHoanhDoDiem1() - this.getHoanhDoDiem2()) / (this.getTungDoDiem1() - this.getTungDoDiem2());
		double kq2 = (d.getHoanhDoDiem1() - d.getHoanhDoDiem2()) / (d.getTungDoDiem1() - d.getTungDoDiem2());
		if(kq1 == kq2)
		{
			return true;
		}
		return false;
	}
	
}
