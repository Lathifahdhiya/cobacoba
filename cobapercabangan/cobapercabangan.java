import java.util.Scanner;

public class cobapercabangan
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("Masukkan sebuah angka");
		x = s.nextInt();
		if (x > 0)
		{
			System.out.println("angka yang dimasukkan merupakan bilangan positif");
		}
		else if (x < 0)
		{
			System.out.println("angka yang dimasukkan merupakan bilangan negatif");
		}
		else
		{
			System.out.println("angka yang dimasukkan adalah 0");
		}
	}
}