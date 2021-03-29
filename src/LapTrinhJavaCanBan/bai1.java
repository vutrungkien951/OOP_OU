package LapTrinhJavaCanBan;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 100;
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) - min;
		boolean guessTrueNumber = false;
		Scanner sc = new Scanner(System.in);
		System.out.println(rand);
		while(guessTrueNumber == false)
		{
			System.out.print("Moi ban nhap so de du doan: ");
			int numberUser = sc.nextInt();
			if (numberUser < rand)
			{
				System.out.println("So ban doan nho hon");
			}
			else if (numberUser > rand)
			{
				System.out.println("So ban doan lon hon");
			}
			else
			{
				System.out.println("Ban da doan dung!");
				guessTrueNumber = true;
			}
		}
		sc.close();
	}

}
