package LopTruuTuongVaGiaoDien;

import java.util.ArrayList;
import java.util.List;

public abstract class CauHoi {
	private static int cauHoiId = 0;
	private String noiDung;
	private List<PhuongAn> listPhuongAn;
	{
		listPhuongAn = new ArrayList<>();
	}
	{
		cauHoiId++;
	}
	public CauHoi(String nd)
	{
		this.noiDung = nd;
	}
	public void themPhuongAn(PhuongAn pa)
	{
		this.listPhuongAn.add(pa);
	}
	public List<PhuongAn> getListPhuongAn()
	{
		return this.listPhuongAn;
	}
	public int getCauHoiId() {
		return cauHoiId;
	}
	public static void setCauHoiId(int cauHoiId) {
		CauHoi.cauHoiId = cauHoiId;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public abstract String toString();
}
