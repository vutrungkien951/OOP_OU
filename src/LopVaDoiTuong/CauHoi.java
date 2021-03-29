package LopVaDoiTuong;
import java.util.*;

public class CauHoi {
	private String noiDung;
	private List<PhuongAn> phuongAn;
	
	public CauHoi(String nd)
	{
		this.noiDung = nd;
		this.phuongAn = new ArrayList<>();
	}
	public String getNoiDung()
	{
		return this.noiDung;
	}
	public void setNoiDung(String nd)
	{
		this.noiDung = nd;
	}
	public List<PhuongAn> getPhuongAn()
	{
		return this.phuongAn;
	}
	public void themPhuongAn(PhuongAn pa)
	{
		this.phuongAn.add(pa);
	}
	public void hienThi()
	{
		System.out.println(this.noiDung);
		char c;
		int i =0;
		for(c = 'A'; c < 'Z'; ++c)
		{
			System.out.println(c + ". " + this.phuongAn.get(i));
			i++;
		}
	}
	
}
