package LopTruuTuongVaGiaoDien;
import java.util.*;

public class QLCauHoi {
	private Hashtable<Integer, CauHoi> hashTable = new Hashtable<Integer, CauHoi>();
	
	public QLCauHoi()
	{
		
	}
	public Hashtable<Integer, CauHoi> getHashTable() {
		return hashTable;
	}
	public void setHashTable(Hashtable<Integer, CauHoi> hashTable) {
		this.hashTable = hashTable;
	}
	public void themCauHoi(CauHoi ch)
	{
		hashTable.put(ch.getCauHoiId(), ch);
	}
	public void xoaCauHoi(int maCH)
	{
		hashTable.remove(maCH);
	}
	public void xemDs()
	{
		System.out.println("Danh sach cau hoi: " + hashTable);
	}
	public List<CauHoi> xemDsCHDVCT()
	{
		List<CauHoi> newList = new ArrayList<>();
		for(Map.Entry<Integer, CauHoi> ch : hashTable.entrySet())
		{
			if(ch.getValue().getClass().getName().equals("LopTruuTuongVaGiaoDien.CauHoiDienVaoChoTrong"))
			{
				newList.add(ch.getValue());
			}
		}
		return newList;
	}
	public List<CauHoi> xemDsCHLC()
	{
		List<CauHoi> newList = new ArrayList<>();
		for(Map.Entry<Integer, CauHoi> ch : hashTable.entrySet())
		{
			if(ch.getValue().getClass().getName().equals("LopTruuTuongVaGiaoDien.CauHoiLuaChon"))
			{
				newList.add(ch.getValue());
			}
		}
		return newList;
	}
	public void luyenTap(Scanner sc)
	{
		System.out.println("Nhap vao loai cau hoi ma ban muon tao: "
				+ "(1. Cau hoi lua chon; 2. Cau hoi dien vao cho trong)");
		String loaiCauHoi = sc.nextLine();
		System.out.println("Moi ban nhap vao so luong cau hoi: ");
		int soCauHoi = Integer.parseInt(sc.nextLine());
		//Collections.shuffle((List<?>) this.hashTable);
		int dem = 0;
		List<CauHoi> dsCauHoi = new ArrayList<>();
		switch(loaiCauHoi)
		{
		case("1"):
			dsCauHoi = this.xemDsCHLC();
			int soCauHoiThat = dsCauHoi.size();
			if(soCauHoiThat < soCauHoi)
			{
				System.out.println("Xin loi chung toi chi co " + soCauHoiThat + " cau hoi");
				soCauHoi = soCauHoiThat;
			}
			while(dem <= soCauHoi)
			{
				char c;
				char dapAnDung = 0;
				int i = 0;
				System.out.println(dem+1 + ". " + dsCauHoi.get(dem));
				for(c = 'A'; c <= 'Z'; ++c)
				{
					if(dsCauHoi.get(dem) == null)
					{
						break;
					}
					else if(dsCauHoi.get(dem).getListPhuongAn().size() == i)
					{
						break;
					}
					System.out.println(c + ". " + dsCauHoi.get(dem).getListPhuongAn().get(i).getNoiDung());
					System.out.println();
					if(dsCauHoi.get(dem).getListPhuongAn().get(i).isPhuongAnDung())
					{
						dapAnDung = c;
					}
					i++;
				}
				System.out.println("Moi ban nhap vao dap an: ");
				String dapAn = sc.nextLine();
				if(dapAn.equals(Character.toString(dapAnDung)))
				{
					System.out.println("Chuc mung ban da tra loi dung!");
				}
				else
				{
					System.out.println("Dap an sai!");
				}
				dem++;
			}
			break;
		case("2"):
		{
			dsCauHoi = this.xemDsCHDVCT();
			soCauHoiThat = dsCauHoi.size();
			if(soCauHoiThat < soCauHoi)
			{
				System.out.println("Xin loi chung toi chi co " + soCauHoiThat + " cau hoi.");
				soCauHoi = soCauHoiThat;
			}
			dem = 0;
			while(dem <= soCauHoi)
			{
				System.out.println(dem+1 + ". " + dsCauHoi.get(dem).getNoiDung());
				dsCauHoi.get(dem).getListPhuongAn().forEach((phuongAn) ->{
					System.out.println("Moi ban dien vao cho trong: ");
					String dapAn = sc.nextLine();
					if(dapAn.equals(phuongAn.getNoiDung()))
					{
						System.out.println("Ban da dien dung");
					}
				});
				dem++;
			}
			break;
		}
		default:
			System.out.println("Invalid!");
			break;
		}
	}
}
