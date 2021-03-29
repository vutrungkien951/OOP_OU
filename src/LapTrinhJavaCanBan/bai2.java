package LapTrinhJavaCanBan;
// Tinh gia tri da thuc bac n
import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khoi tao bien
		ArrayList<Integer> a = new ArrayList<Integer>();
		int n;
		int x;
		double sum = 0;
		//Input cac bien
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao 1 so n: ");
		n = sc.nextInt();
		for (int i = 0; i < n+1; i++)
		{
			System.out.print("Moi ban nhap vao so nguyen a(i):");
			int ai = sc.nextInt();
			a.add(ai);
		}
		System.out.print("Moi ban nhap vao 1 so nguyen x: ");
		x = sc.nextInt();
		sc.close();
		//Tinh toan
		for(int i=0 ; i < n+1; i++)
		{
			sum += a.get(i) * Math.pow(x, i);
		}
		//Xuat dap an
		System.out.print("Ket qua cua phep tinh la: " + sum);
	}

}
