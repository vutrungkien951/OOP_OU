package LopVaDoiTuong;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;


public class QLCauHoi {
	private List<CauHoi> dsCauHoi;
	
	public QLCauHoi()
	{
		this.dsCauHoi = new ArrayList<>();
	}
	public void taoCauHoi(Scanner scanner, String tenFile) throws FileNotFoundException
	{
		System.out.println("Moi ban nhap cau hoi: ");
		CauHoi cauHoi = new CauHoi(scanner.nextLine());
		dsCauHoi.add(cauHoi);
		PrintWriter pw = new PrintWriter("CauHoi/"+tenFile);
		pw.write(cauHoi.getNoiDung());
		pw.close();
	}
	public void docDsCauHoi()
	{
		for(CauHoi ch: dsCauHoi)
		{
			System.out.println(ch.getNoiDung());
		}
	}
	public void luyenTap(Scanner scanner, int soLuong)
	{
		Collections.shuffle(this.dsCauHoi);
		for(int i=0; i < soLuong; i++)
		{
			System.out.printf("Cau hoi %d\n", i+1);
			CauHoi ch = this.dsCauHoi.get(i);
			ch.hienThi();
			System.out.println("Lua chon cua ban (A, B, C, D): ");
			String c = scanner.nextLine();
			int idx = (c.charAt(0) + 3) % 4;
			if(ch.getPhuongAn().get(idx).isChinhXac())
			{
				System.out.println("Chinh xac!");
			}
			else
			{
				System.out.println("Sai roi!");
			}
		}
	}
}
