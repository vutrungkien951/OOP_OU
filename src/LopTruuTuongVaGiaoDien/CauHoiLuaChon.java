package LopTruuTuongVaGiaoDien;


public class CauHoiLuaChon extends CauHoi{
	public CauHoiLuaChon(String noiDung)
	{
		super(noiDung);
	}
	public void themPhuongAn(PhuongAn pa)
	{
		super.getListPhuongAn().add(pa);
	}
	public void themPhuongAn(String nd,String gt, boolean pad)
	{
		super.getListPhuongAn().add(new PhuongAn(nd, gt, pad));
	}
	@Override
	public String toString()
	{
		return this.getNoiDung();
	}
}
