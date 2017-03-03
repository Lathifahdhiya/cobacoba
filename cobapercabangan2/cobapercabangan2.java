import java.util.Scanner;

public class cobapercabangan2
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("Masukkan sebuah angka");
		x = s.nextInt();
		switch (x)
		{
			case 1 : System.out.println("Ini adalah angka satu");break;
			case 2 : System.out.println("Ini adalah angka dua");break;
			case 3 : System.out.println("Ini adalah angka tiga");break;
			default : System.out.println("Ini adalah angka selain satu, dua, dan tiga");
		}
	}
}