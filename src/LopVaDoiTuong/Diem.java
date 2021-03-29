package LopVaDoiTuong;

public class Diem {
	private int hoanhDo;
	private int tungDo;
	
	public Diem(int h, int t)
	{
		this.hoanhDo = h;
		this.tungDo = t;
	}
	
	public void setHoanhDo(int h)
	{
		this.hoanhDo = h;
	}
	public void setTungDo(int t)
	{
		this.tungDo = t;
	}
	public int getHoanhDo()
	{
		return this.hoanhDo;
	}
	public int getTungDo()
	{
		return this.tungDo;
	}
	
	public void hienThi()
	{
		System.out.println("Hoanh do: " + this.hoanhDo);
		System.out.println("Tung do: " + this.tungDo);
	}
	public double khoangCach(Diem d)
	{
		return Math.sqrt(Math.pow(this.hoanhDo-d.hoanhDo,2) + Math.pow(this.tungDo-d.hoanhDo,2));
	}
	
}
