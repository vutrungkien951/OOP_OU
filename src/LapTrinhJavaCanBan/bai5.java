//Cho ma tran a kich thuoc m x n
//Tinh tong tren tung dong va tong tren tung cot
//Tim chi so dong co tong lon nhat va chi so cot co tong nho nhat
//Nhap chi so dong d, tinh tong va tim gia tri nho nhat dong d
//Nhap chi so cot c, tinh tong va tim gia tri lon nhat cot c
package LapTrinhJavaCanBan;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai bao input
		Scanner sc = new Scanner(System.in);
		//Khai bao ma tran a kich thuoc m x n
		int a[][] = {{1,2,3}, {2,15,23}, {2,1,5}};
		//m la cot, n la dong
		int m = 3;
		int n = 3;
		
		//Tinh tong tren tung dong
		int[] tongDong = new int[n];
		for(int i=0; i < m; i++)
		{
			int tong = 0;
			for(int y=0; y < n; y++)
			{
				tong += a[i][y];	
			}
			tongDong[i] = tong;
			System.out.println("Tong dong " + i + " la: " + tong);
		}
		//Tinh tong tren tung cot
		int[] tongCot = new int[m];
		for(int i=0; i < n; i++)
		{
			int tong = 0;
			for(int y=0; y < m; y++)
			{
				tong += a[y][i];
			}
			tongCot[i] = tong;
			System.out.println("Tong cot " + i + " la: " + tong);
		}
		
		//Tim chi so dong co tong lon nhat
		//Khai bao bien
		int chiSoDongCoTongLonNhat = 0;
		int tongLonNhat = tongDong[0];
		//Thuat toan tim chi so dong lon nhat
		for (int i=0; i < tongDong.length; i++)
		{
			if(tongDong[i] > tongLonNhat)
			{
				tongLonNhat = tongDong[i];
				chiSoDongCoTongLonNhat = i;
			}
		}
		//Xuat ket qua
		System.out.println("Chi so dong co tong lon nhat la: " + chiSoDongCoTongLonNhat);
		
		//Tim chi so cot co tong nho nhat
		//Khai bao bien
		int chiSoCotCoTongNhoNhat = 0;
		int tongNhoNhat = tongCot[0];
		//Thuat toan tim chi so cot nho nhat
		for(int i=0; i < tongCot.length; i++)
		{
			if(tongCot[i] < tongNhoNhat)
			{
				tongNhoNhat = tongCot[i];
				chiSoCotCoTongNhoNhat = i;
			}
		}
		//Xuat ket qua
		System.out.println("Chi so cot co tong nho nhat la: " + chiSoCotCoTongNhoNhat);
		
		//Nhap chi so dong d, tinh tong va tim gia tri nho nhat dong d
		//Nhap d
		int d;
		System.out.print("Moi ban nhap vao chi so dong d: ");
		d = sc.nextInt();
		//Khai bao bien
		int giaTriNhoNhatDongD = a[0][d];
		//Tinh tong dong da tinh o bai tren
		int tongDongD = tongDong[d];
		//Tim gia tri nho nhat dong d
		for(int i=0; i < m; i++)
		{
			if(a[i][d] < giaTriNhoNhatDongD)
			{
				giaTriNhoNhatDongD = a[i][d];
			}
		}
		//Xuat tong dong d va gia tri nho nhat dong d
		System.out.println("Tong dong " + d + " la: " + tongDongD);
		System.out.println("Gia tri nho nhat dong d la: " + giaTriNhoNhatDongD);
		
		//Nhap chi so cot c, tinh tong va gia tri lon nhat cot c
		//Nhap c
		int c;
		System.out.print("Moi ban nhap vao chi so cot c: ");
		c = sc.nextInt();
		//Dong input
		sc.close();
		//Khai bao bien
		int giaTriNhoNhatCotC = a[c][0];
		//Tinh tong cot c, da tinh o tren
		int tongCotC = tongCot[c];
		//Tinh gia tri lon nhat cot c
		for(int i=0; i<n; i++)
		{
			if(a[c][i] < giaTriNhoNhatCotC)
			{
				giaTriNhoNhatCotC = a[c][i];
			}
		}
		//Xuat tong va gia tri nho nhat cot c
		System.out.println("Tong cua cot " + c + " la: "+ tongCotC);
		System.out.println("Gia tri nho nhat cot " + c + " la: " + giaTriNhoNhatCotC);
	}

}
