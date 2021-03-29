package LopTruuTuongVaGiaoDien;
import java.util.*;

public class CauHoiDienVaoChoTrong extends CauHoi{
	private List<PhuongAn> phuongAnDung = new ArrayList<>();
	public CauHoiDienVaoChoTrong(String nd)
	{
		super(nd);
	}
	public void themPhuongAnDung(PhuongAn pa)
	{
		phuongAnDung.add(pa);
	}
	@Override
	public String toString()
	{
		return this.getNoiDung();
	}
}
