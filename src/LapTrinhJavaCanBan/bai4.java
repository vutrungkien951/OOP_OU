//Lap trinh tinh tong cac so nguyen to
//Tim so duong lon nhat va so am nho nhat

package LapTrinhJavaCanBan;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tinh tong cac so nguyen to
		//khai bao bien
		int[] n = {1, 2, 3, 5, 7, 9, 12, 31};
		int tongCacSoNguyenTo = 0;
		//Tinh tong cac so nguyen to trong mang
		for(int i: n)
		{
			if(i == 1)
			{
				continue;
			}
			else
			{
				boolean soNguyenTo = false;
				for(int y=2; y < i; y++)
				{
					if (y%i == 0)
					{
						soNguyenTo = true;
					}
				}
				if(soNguyenTo == true)
				{
					tongCacSoNguyenTo += i;
				}
			}
		}
		//Xuat ket qua
		System.out.println("Tong cac so nguyen to trong day la: " + tongCacSoNguyenTo);
		
		//Tim so duong lon nhat
		//Khai bao bien
		int soLonNhat = n[0];
		boolean coSoDuong = false;
		//Thuat toan thi so lon nhat trong mang
		for (int i: n)
		{
			if(i > soLonNhat)
			{
				soLonNhat = i;
			}
		}
		if(soLonNhat > 0)
		{
			coSoDuong = true;
		}
		//Xuat ket qua
		if(coSoDuong == true)
		{
			System.out.println("So duong lon nhat trong mang la: " + soLonNhat);
		}
		else
		{
			System.out.println("*");
		}
		//Tim so am nho nhat
		//Khai bao bien
		int soNhoNhat = n[0];
		boolean coSoAm = false;
		//Thuat toan tim so am nho nhat
		for(int i:n)
		{
			if(i < soNhoNhat)
			{
				soNhoNhat = i;
			}
		}
		if(soNhoNhat < 0)
		{
			coSoAm = true;
		}
		//Xuat ket qua
		if(coSoAm == true)
		{
			System.out.println("So am nho nhat trong mang la: " + soNhoNhat);
		}
		else
		{
			System.out.println("*");
		}
		
	}

}
