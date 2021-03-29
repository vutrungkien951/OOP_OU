//Lap trinh giai 5 bai toan

package LapTrinhJavaCanBan;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class bai3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Khoi tao tai nguyen Scanner sc
		Scanner sc = new Scanner(System.in);
		//Bai 1 tim ten dia chi email
		//Khai bao bien
		System.out.print("Moi ban nhap vao dia chi email: ");
		String email = sc.nextLine();
		//Xu li de tim ten dia chi
		String[] splitEmail = email.split("@", 2);
		//Xuat ten dia chi email
		String tenDiaChiMail = splitEmail[0];
		System.out.println("Ten dia chi email la: " + tenDiaChiMail);
		
		
		//Bai 2 dem so luong ki tu hoa cua chuoi
		//Nhap chuoi de dem ki tu hoa
		System.out.print("Nhap chuoi de dem ki tu hoa: ");
		String strBai2 = sc.nextLine();
		//Khai bao bien dem chuoi
		int demKiTuHoa = 0;
		//Dem so ki tu hoa
		for(int i=0; i<strBai2.length(); i++)
		{
			if(Character.isUpperCase(strBai2.charAt(i)))
			{
				demKiTuHoa += 1;
			}
		}
		//Xuat so luong ki tu hoa
		System.out.println("So luong ki tu hoa cua chuoi la: " + demKiTuHoa);
		
		
		//Bai 3 doc du lieu va thay the bang ki tu khac
		//Khai bao bien va doc file
		File fileInput = new File("src/input.txt");
		try(Scanner scFile = new Scanner(fileInput))
		{
			String strBai3 = "";
			while(scFile.hasNext())
			{
				strBai3 += scFile.next() + " ";
			}
			strBai3 = strBai3.replace("{file}", "tap tin");
			File fileOutput = new File("src/output.txt");
			try(PrintWriter p = new PrintWriter(fileOutput))
			{
				p.write(strBai3);
				p.close();
				System.out.println("Ghi file thanh cong!");
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			scFile.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		
		//Bai 4 dem so tu trong chuoi
		//Nhap chuoi
		System.out.print("Nhap chuoi de dem tu: ");
		String strBai4 = sc.nextLine();
		//tach chuoi bang split
		String[] splitStrBai4 = strBai4.split("[ -;]");
		//Tim chuoi dai nhat
		String tuDaiNhat = "";
		int soTuDaiNhatTrongChuoi = 0;
		for(int i=0; i<splitStrBai4.length; i++)
		{
			int demSoTu = 0;
			for(int y=0; y < splitStrBai4[i].length(); y++)
			{
				demSoTu++;
			}
			if(demSoTu > soTuDaiNhatTrongChuoi)
			{
				soTuDaiNhatTrongChuoi = demSoTu;
				tuDaiNhat = splitStrBai4[i];
			}
		}
		//Xuat so tu trong chuoi va tu dai nhat cua chuoi
		System.out.println("So tu trong chuoi la: " + splitStrBai4.length);
		System.out.println("Tu dai nhat trong chuoi la: " + tuDaiNhat);
		
		
		//Bai 5 chuan hoa chuoi
		//Nhap chuoi de chuan hoa
		System.out.print("Nhap vao chuoi de chuan hoa: ");
		String strBai5 = sc.nextLine();
		//Xoa khoang trang o dau chuoi
		int demKiTuDauTien = 0;
		for(int i=0; i<strBai5.length(); i++)
		{
			if(Character.isLetter(strBai5.charAt(i)))
			{
				demKiTuDauTien = i;
				break;
			}
			if(strBai5.charAt(i) == ' ')
			{
				continue;
			}
		}
		strBai5 = strBai5.substring(demKiTuDauTien);
		//Chuan hoa chuoi 
		String[] splitStrBai5 = strBai5.split("[ ]+");
		String strBai5ChuanHoa = "";
		for(int i=0; i<splitStrBai5.length; i++)
		{
			strBai5ChuanHoa = strBai5ChuanHoa + splitStrBai5[i] + " ";
		}
		//Xuat chuoi da chuan hoa
		System.out.println("Chuoi sau khi chuan hoa: " + strBai5ChuanHoa);
		
		//Dong tai nguyen Scanner
		sc.close();
	}

}
