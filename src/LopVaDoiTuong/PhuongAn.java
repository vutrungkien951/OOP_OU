package LopVaDoiTuong;

public class PhuongAn {
	private String noiDung;
	private boolean chinhXac = false;
	
	public PhuongAn(String nd)
	{
		this.noiDung = nd;
	}
	public PhuongAn(String nd, boolean cx)
	{
		this.noiDung = nd;
		this.chinhXac = cx;
	}
	public String getNoiDung()
	{
		return this.noiDung;
	}
	public boolean isChinhXac()
	{
		return this.chinhXac;
	}
	public void setNoiDung(String nd)
	{
		this.noiDung = nd;
	}
	public void setChinhXac(boolean cx)
	{
		this.chinhXac = cx;
	}
	
	
}
