package LopVaDoiTuong;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.lang.Comparable;

public class HocVien implements Comparable<HocVien>{
	private int maHV;
	private String hoTen;
	private Date ngaySinh;
	private String gioiTinh;
	private String queQuan;
	private double[] diem = new double[3];
	private static int dem = 0;
	
	public HocVien(String ht, Date ns,String gt, String qq)
	{
		this.hoTen = ht;
		this.ngaySinh = ns;
		this.gioiTinh = gt;
		this.maHV = dem;
		this.queQuan = qq;
		dem++;
	}
	public HocVien()
	{
		//
	}
	public void nhapThongTin(Scanner scanner)
	{
		System.out.print("Nhap ho va ten: ");
		this.hoTen = scanner.nextLine();
		System.out.print("Nhap ngay, thang, nam sinh(dd/MM/yyyy): ");
		int ngaySinh = scanner.nextInt();
		int thangSinh = scanner.nextInt();
		int namSinh = scanner.nextInt();
		System.out.println("Nhap gioi tinh: ");
		this.gioiTinh = scanner.nextLine();
		String str = ngaySinh + "/" + thangSinh + "/" + namSinh;
		SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date ns = ft.parse(str);
			this.ngaySinh = ns;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Nhap que quan: ");
		this.queQuan = scanner.nextLine();
		return;
	}
	public void nhapDiem(Scanner scanner)
	{
		System.out.print("Nhap diem mon 1: ");
		double diem1 = scanner.nextDouble();
		System.out.print("Nhap diem mon 2: ");
		double diem2 = scanner.nextDouble();
		System.out.print("Nhap diem mon 3: ");
		double diem3 = scanner.nextDouble();
		this.diem[0] = diem1;
		this.diem[1] = diem2;
		this.diem[2] = diem3;
	}
	public void hienThi()
	{
		System.out.printf("Ho ten: %s.\nQue quan: %s\n", this.hoTen, this.queQuan);
		SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Ngay sinh: " + ft.format(this.ngaySinh));
		for(double d: this.diem)
		{
			System.out.println("Diem: " + d);
		}
	}
	public String getGioiTinh()
	{
		return this.gioiTinh;
	}
	public int getMaHV()
	{
		return this.maHV;
	}
	public String getHoTen()
	{
		return this.hoTen;
	}
	public String getQueQuan()
	{
		return this.queQuan;
	}
	public double[] getDiem()
	{
		return this.diem;
	}
	public static Comparator<HocVien> sapXepTheoBangDiem1 = new Comparator<HocVien>() {
		
		public int compare(HocVien hv1, HocVien hv2)
		{
			return hv1.diem[0] > hv2.diem[0] ? 1 : hv1.diem[0] < hv2.diem[0] ? -1: 0;
		}
	};
	public static Comparator<HocVien> sapXepBangDiem2 = new Comparator<HocVien>() {
		public int compare(HocVien hv1, HocVien hv2)
		{
			return hv1.diem[1] > hv2.diem[1] ? 1 : hv1.diem[1] < hv2.diem[1] ? -1: 0;
		}
	};
	public static Comparator<HocVien> sapXepBangDiem3 = new Comparator<HocVien>() {
		public int compare(HocVien hv1, HocVien hv2)
	{
		return hv1.diem[0] > hv2.diem[0] ? 1 : hv1.diem[0] < hv2.diem[0] ? -1: 0;
	}
	};
	@Override
	public int compareTo(HocVien hv)
	{
		double tongDiemthis = 0;
		for(double d: this.diem)
		{
			tongDiemthis += d;
		}
		double tongDiemhv = 0;
		for(double d: hv.diem)
		{
			tongDiemhv += d;
		}
		return tongDiemthis > tongDiemhv ? 1 : tongDiemthis < tongDiemhv ? -1 : 0;
	}
}